package ovh.xmlbeantojavabean.api

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.xml.sax.SAXParseException
import java.io.File

class XMLConverterImplTest {

    @DisplayName("The API should fail early if the given XML file doesn't exist")
    @Test
    fun errorIfFileDoesntExist() {
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
}