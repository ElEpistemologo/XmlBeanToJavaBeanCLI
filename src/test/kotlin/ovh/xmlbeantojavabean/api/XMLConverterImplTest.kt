package ovh.xmlbeantojavabean.api

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.xml.sax.SAXParseException
import java.io.File
import java.nio.file.FileVisitResult
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.SimpleFileVisitor
import java.nio.file.attribute.BasicFileAttributes

class XMLConverterImplTest {

    @DisplayName("The API should fail early if the given XML file doesn't exist")
    @Test
    fun errorIfFileDoNotExist() {
        val nonExistingFile = File("à)&à)('çà'")
        val converter = XMLConverterImpl()
        assertThrows<IllegalArgumentException> { converter.generateJava(nonExistingFile) }
    }
    @DisplayName("The API should fail early if the file is not a XML")
    @Test
    fun errorIfFileIsNotAXML() {
        val nonXMLFile = File("src/test/resources/myBeans.html")
        assertTrue(nonXMLFile.exists())
        val converter = XMLConverterImpl()
        assertThrows<IllegalArgumentException> { converter.generateJava(nonXMLFile) }
    }

    @DisplayName("The API should fail early if the XML is not valid Spring Bean file")
    @Test
    fun errorIfXMLIsNotValid() {
        val malformedXMLFile = File("src/test/resources/myInvalidBeans.xml")
        assertTrue(malformedXMLFile.exists())
        val converter = XMLConverterImpl()
        assertThrows<SAXParseException> { converter.generateJava(malformedXMLFile) }
    }

    @DisplayName("The API generate a java file when the given XML is a valid spring beans xml file")
    @Test
    fun generateJavaFile() {
        val xmlBeans = File("src/test/resources/xmlInputCases/beans1.xml")

        val converter = XMLConverterImpl()
        converter.generateJava(xmlBeans)

        val javaBeans = File("src/test/output/beans1.java")
        assertTrue(javaBeans.exists())
    }

    @Test
    fun generateSingleton() {
        generateJava("beans2")
        validateGeneratedJava("beans2")
    }
    private fun generateJava(sourceName: String) {
        val xmlBeans = File("src/test/resources/xmlInputCases/$sourceName.xml")
        val converter = XMLConverterImpl()
        converter.generateJava(xmlBeans)
    }
    private fun validateGeneratedJava(sourceName: String) {
        val javaBeansReference = File("src/test/resources/javaOutPutReferences/$sourceName.java")
        val javaBeansOutput = File("src/test/output/$sourceName.java")
        val referenceBytes = Files.readAllBytes(javaBeansReference.toPath())
        val outputBytes = Files.readAllBytes(javaBeansOutput.toPath())
        assertTrue(referenceBytes.contentEquals(outputBytes))
    }

    companion object {
        @JvmStatic
        @AfterAll
        fun cleanOutput() {
            val deleteAllFiles = object : SimpleFileVisitor<Path>() {
                override fun visitFile(file: Path?, attrs: BasicFileAttributes?): FileVisitResult {
                    if (file != null) {
                        Files.delete(file)
                    }
                    return FileVisitResult.CONTINUE
                }
            }
            Files.walkFileTree(Path.of("src/test/output"), deleteAllFiles)
        }
    }
}