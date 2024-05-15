package ovh.xmlbeantojavabean.api

import com.google.common.base.Preconditions
import com.squareup.javapoet.ClassName
import com.squareup.javapoet.JavaFile
import com.squareup.javapoet.MethodSpec
import com.squareup.javapoet.TypeSpec
import jakarta.xml.bind.JAXBContext
import ovh.xmlbeantojavabean.api.beans.Bean
import ovh.xmlbeantojavabean.api.beans.Beans
import ovh.xmlbeantojavabean.api.beans.ConstructorArg
import java.io.File
import java.util.stream.Collectors
import javax.lang.model.element.Modifier
import javax.xml.XMLConstants
import javax.xml.transform.stream.StreamSource
import javax.xml.validation.SchemaFactory
import javax.xml.validation.Validator


class XMLConverterImpl : XMLConverter {
    override fun generateJava(file: File) {
        Preconditions.checkArgument(file.exists())
        Preconditions.checkArgument(file.path.endsWith(".xml"))
        getValidator().validate(StreamSource(file))

        val jc = JAXBContext.newInstance("ovh.xmlbeantojavabean.api.beans")
        val unmarshaller = jc.createUnmarshaller()
        val beans : Beans = unmarshaller.unmarshal(file) as Beans

        val className = file.name.removeSuffix(".xml")
        val javaFile2 = JavaFile.builder("", generateClass(beans, className))
            .skipJavaLangImports(true)
            .indent("    ")
            .build()

        val destinationPath = file.toPath().parent.toFile()

        javaFile2.writeTo(destinationPath)
    }

    private fun generateClass(beans: Beans, className: String) : TypeSpec  {

        val configurationAnnotation : ClassName =
            ClassName.get("org.springframework.context.annotation", "Configuration")

        val configurationClass = TypeSpec.classBuilder(className)
            .addModifiers(Modifier.PUBLIC)
            .addAnnotation(configurationAnnotation)

        beans.importOrAliasOrBean.stream()
            .filter { it is Bean }
            .map { it as Bean }
            .map { generateMethod(it) }
            .forEach{configurationClass.addMethod(it)}

        return configurationClass.build()
    }

    private fun generateMethod(bean : Bean) : MethodSpec {
        val id = bean.id
        val clazzComplete = bean.clazz
        val clazzShortOpt = clazzComplete.split(".").stream()
            .reduce{ _: String, last: String -> last}
        val clazzShort = clazzShortOpt.get()
        val clazzPackage = clazzComplete.split(".").stream()
            .limit(clazzComplete.count { it == '.' }.toLong())
            .collect(Collectors.joining("."))

        val beanType : ClassName = ClassName.get(clazzPackage, clazzShort)
        val beanAnnotation : ClassName = ClassName.get("org.springframework.context.annotation", "Bean")

        val method = MethodSpec.methodBuilder(id)
            .addModifiers(Modifier.PUBLIC)
            .returns(beanType)
            .addAnnotation(beanAnnotation)
            .addStatement(generateConstructionStatement(bean, clazzShort, id))
            .addStatement("return $id")
            .build()

        return method
    }

    private fun generateConstructionStatement(bean : Bean, clazzShort: String, id: String?) :String {
        val constructorArgs : String = bean.metaOrConstructorArgOrProperty.stream()
            .filter{it is ConstructorArg}
            .map{it as ConstructorArg}
            .map{ addCrochetIfString(it) }
            .collect(Collectors.joining(", "))

      return "$clazzShort $id = new $clazzShort($constructorArgs)"
    }

    private fun addCrochetIfString(arg: ConstructorArg): String {
        if (arg.type == "java.lang.String") return "\"${arg.value}\""
        return arg.value
    }

    private fun getValidator() : Validator {
        val factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI)
        val xsdUri = javaClass.getResourceAsStream("/xsd/springBeans.xsd")
        val xsd = StreamSource(xsdUri)
        val schema = factory.newSchema(xsd)
        return schema.newValidator()
    }
}