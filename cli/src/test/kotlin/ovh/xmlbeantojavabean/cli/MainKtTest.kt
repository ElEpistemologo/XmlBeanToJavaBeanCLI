package ovh.xmlbeantojavabean

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.PrintStream
import java.nio.file.FileVisitResult
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.SimpleFileVisitor
import java.nio.file.attribute.BasicFileAttributes
import java.util.regex.Pattern

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
        main(arrayOf("-v"))
        assertEquals(wrap("xml bean to java bean version 0.0.1.0-SNAPSHOT"), output.toString())
    }

    @DisplayName("The CLI should display help information when called without arguments")
    @Test
    fun displayHelpWhenNoArg() {
        main(arrayOf())
        assertEquals(wrap(HELP_MESSAGE), output.toString())
    }
    @DisplayName("The CLI should display help information when called with -h argument")
    @Test
    fun displayHelp() {
        main(arrayOf("-h"))
        assertEquals(wrap(HELP_MESSAGE), output.toString())
    }

    @DisplayName("The CLI should accept only one XML file as argument, and should display an error message otherwise")
    @Test
    fun acceptOnlyOneXMLFileAsArgument() {
        main(arrayOf("myBeans.xml", "myOthersBeans.xml"))
        assertEquals(wrap("error"), output.toString())
    }

    @DisplayName("The CLI should refuse a file name argument that is not an xml")
    @ParameterizedTest
    @ValueSource(strings = ["myBeans.html", "toto", "5é&9té9d1cé"])
    fun refuseNonXMLFile(fileName : String) {
        main(arrayOf(fileName))
        assertEquals(wrap("error"), output.toString())
    }

    @Test
    fun `The CLI should generate a java class when given a valid bean XML`() {
        main(arrayOf("src/test/resources/xmlInputCases/Beans1.xml"))
        val javaFile = File("src/test/resources/xmlInputCases/Beans1.java")
        assertTrue(javaFile.exists())
    }

    private fun wrap(str : String) = str + "\r\n"

    companion object {
        @JvmStatic
        @AfterAll
        fun cleanOutput() {
            val deleteAllFiles = object : SimpleFileVisitor<Path>() {
                override fun visitFile(file: Path?, attrs: BasicFileAttributes?): FileVisitResult {
                    if (file != null && Pattern.matches(".*java", file.toRealPath().toString()) ) {
                        Files.delete(file)
                    }
                    return FileVisitResult.CONTINUE
                }
            }
            Files.walkFileTree(Path.of("src/test/resources/xmlInputCases"), deleteAllFiles)
        }
    }

}