package ovh.xmlbeantojavabean

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import java.io.ByteArrayOutputStream
import java.io.PrintStream

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MainKtTest {

    private val output = ByteArrayOutputStream()

    @BeforeAll
    fun setupStreams(): Unit {
        System.setOut(PrintStream(output))
    }

    @DisplayName("The tool should display its version")
    @Test
    fun displayVersion() {
        main(listOf("-v"))
        assertEquals(wrap("xml bean to java bean version 0.0.1.0-SNAPSHOT"), output.toString())
    }

    private fun wrap(str : String) : String = str + "\r\n"

}