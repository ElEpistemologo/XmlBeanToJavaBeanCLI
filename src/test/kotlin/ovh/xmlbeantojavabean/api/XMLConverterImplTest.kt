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
        val xmlBeans = File("src/test/resources/beans1.xml")
        assertTrue(xmlBeans.exists())

        val converter = XMLConverterImpl()
        converter.generateJava(xmlBeans)

        val javaBeans = File("src/test/output/beans1.java")
        assertTrue(javaBeans.exists())
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