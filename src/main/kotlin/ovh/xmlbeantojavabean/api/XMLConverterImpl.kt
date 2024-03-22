package ovh.xmlbeantojavabean.api

import com.google.common.base.Preconditions
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
    }

    private fun getValidator() : Validator {
        val factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI)
        val xsd = StreamSource(File(System.getProperty("user.dir")+ "/src/main/resources/xsd/springBeans.xsd"))
        val schema = factory.newSchema(xsd)
        return schema.newValidator()
    }
}