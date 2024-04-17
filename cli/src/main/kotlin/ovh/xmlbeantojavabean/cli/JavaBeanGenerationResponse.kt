package ovh.xmlbeantojavabean

import ovh.xmlbeantojavabean.api.XMLConverterImpl
import java.io.File

class JavaBeanGenerationResponse : ResponseProcessor {
    override fun generateResponse(arguments: List<String>) {
        val filePath = arguments[0]
        val javaGenerator = XMLConverterImpl()
        javaGenerator.generateJava(File(filePath))
    }
}