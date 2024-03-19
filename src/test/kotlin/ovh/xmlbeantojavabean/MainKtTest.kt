package ovh.xmlbeantojavabean

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import java.io.ByteArrayOutputStream
import java.io.PrintStream

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
        assertEquals(wrap("XML Bean to Java Bean CLI Tool Help"), output.toString())
    }

    @DisplayName("The CLI should accept an XML file as an argument")
    @Test
    fun acceptXMLFileAsArgument() {
        main(listOf("myBeans.xml"))
        assertEquals(wrap("Translating myBeans.xml to java beans"), output.toString())
    }

    @DisplayName("The CLI should accept only one XML file as argument, and should display an error message otherwise")
    @Test
    fun acceptOnlyOneXMLFileAsAgument() {
        main(listOf("myBeans.xml", "myOhtersBeans.xml"))
        assertEquals(wrap("error"), output.toString())
    }

    private fun wrap(str : String) : String = str + "\r\n"

}