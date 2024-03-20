package ovh.xmlbeantojavabean.api

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.io.File

class XMLConverterImplTest {

    @DisplayName("The API should fail early if the given XML file doesn't exist")
    @Test
    fun reportErrorIfFileDoesntExist() {
        val nonExistingFile = File("à)&à)('çà'")
        val converter = XMLConverterImpl()
        assertThrows<IllegalArgumentException> { converter.generateJava(nonExistingFile) }
    }
    @DisplayName("The API should fail early if the file is not a XML")
    @Test
    fun errorIfFileIsNotAXML() {
        val nonExistingFile = File("src/test/resources/myBeans.html")
        assertTrue(nonExistingFile.exists())
        val converter = XMLConverterImpl()
        assertThrows<IllegalArgumentException> { converter.generateJava(nonExistingFile) }
    }
}