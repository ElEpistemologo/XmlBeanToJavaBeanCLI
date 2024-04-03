package ovh.xmlbeantojavabean.api

import com.google.common.base.Preconditions
import jakarta.xml.bind.JAXBContext
import ovh.xmlbeantojavabean.api.beans.Bean
import ovh.xmlbeantojavabean.api.beans.Beans
import java.io.File
import javax.xml.XMLConstants
import javax.xml.transform.stream.StreamSource
import javax.xml.validation.SchemaFactory
import javax.xml.validation.Validator


class XMLConverterImpl : XMLConverter {
    override fun generateJava(file: File) {
        Preconditions.checkArgument(file.exists())
        Preconditions.checkArgument(file.path.endsWith(".xml"))
        getValidator().validate(StreamSource(file))

        val fileName = file.name.removeSuffix(".xml")
        val javaFile = File("src/test/output/$fileName.java")
        javaFile.createNewFile()

        val jc = JAXBContext.newInstance("ovh.xmlbeantojavabean.api.beans")
        val unmarshaller = jc.createUnmarshaller()
        val beans : Beans = unmarshaller.unmarshal(file) as Beans

        val idOpt = beans.importOrAliasOrBean.stream()
            .filter { it is Bean }
            .map { it as Bean }
            .map { it.id }
            .findFirst()

        val clazzOpt = beans.importOrAliasOrBean.stream()
            .filter { it is Bean }
            .map { it as Bean }
            .map { it.clazz }
            .findFirst()

        if (idOpt.isPresent && clazzOpt.isPresent) {

            val id = idOpt.get()
            val clazzComplete = clazzOpt.get()
            val clazzShortOpt = clazzComplete.split(".").stream()
                .reduce{ s: String, last: String -> last}
            val clazzShort = clazzShortOpt.get()

            val writer = javaFile.bufferedWriter()
            writer.write("""
                import org.springframework.context.annotation.Bean;
                import org.springframework.context.annotation.Configuration;
                import $clazzComplete;
    
                @Configuration
                public class ConfigurationTest {
    
                    @Bean
                    $clazzShort $id() {
                        $clazzShort $id = new $clazzShort();
                        return $id;
                    }
    
                }
            """.trimIndent().replace("\n", System.lineSeparator()))
            writer.close()
        }

    }

    private fun getValidator() : Validator {
        val factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI)
        val xsd = StreamSource(File(System.getProperty("user.dir")+ "/src/main/resources/xsd/springBeans.xsd"))
        val schema = factory.newSchema(xsd)
        return schema.newValidator()
    }
}