package ovh.xmlbeantojavabean

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import java.io.ByteArrayOutputStream
import java.io.PrintStream

private const val HELP_MESSAGE = "XML Bean to Java Bean CLI Tool Help"

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MainKtTest {

    private var output = ByteArrayOutputStream()

     @BeforeEach
     fun flushOutput() {
         output = ByteArrayOutputStream()
         System.setOut(PrintStream(output))
     }

    @DisplayName("The CLI should display its version")
    @Test
    fun displayVersion() {
        main(listOf("-v"))
        assertEquals(wrap("xml bean to java bean version 0.0.1.0-SNAPSHOT"), output.toString())
    }

    @DisplayName("The CLI should display help information when called without arguments")
    @Test
    fun displayHelpWhenNoArg() {
        main()
        assertEquals(wrap(HELP_MESSAGE), output.toString())
    }
    @DisplayName("The CLI should display help information when called with -h argument")
    @Test
    fun displayHelp() {
        main(listOf("-h"))
        assertEquals(wrap(HELP_MESSAGE), output.toString())
    }

    @DisplayName("The CLI should accept an XML file as an argument")
    @Test
    fun acceptXMLFileAsArgument() {
        main(listOf("myBeans.xml"))
        assertEquals(wrap("Translating myBeans.xml to java beans"), output.toString())
    }

    @DisplayName("The CLI should accept only one XML file as argument, and should display an error message otherwise")
    @Test
    fun acceptOnlyOneXMLFileAsArgument() {
        main(listOf("myBeans.xml", "myOthersBeans.xml"))
        assertEquals(wrap("error"), output.toString())
    }

    @DisplayName("The CLI should refuse a file name argument that is not an xml")
    @ParameterizedTest
    @ValueSource(strings = ["myBeans.html", "toto", "5é&9té9d1cé"])
    fun refuseNonXMLFile(fileName : String) {
        main(listOf(fileName))
        assertEquals(wrap("error"), output.toString())
    }

    private fun wrap(str : String) : String = str + "\r\n"

}