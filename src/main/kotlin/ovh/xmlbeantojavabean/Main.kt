package ovh.xmlbeantojavabean

import java.io.File
import java.io.FileInputStream
import java.util.Properties

fun main(args: List<String> = emptyList()) {

    if (args.isEmpty()) {
        println("XML Bean to Java Bean CLI Tool Help")
        return
    }

    if (args.size == 1 && args[0].endsWith(".xml")){
        val fileName = args[0]
        println("Translating $fileName to java beans")
        return
    }

    val file = File("src\\test\\resources\\properties")

    val props = Properties()
    FileInputStream(file).use { props.load(it) }

    val versionNumber = props.getProperty("version")

    println("xml bean to java bean version $versionNumber")
}