package ovh.xmlbeantojavabean

import java.io.File
import java.io.FileInputStream
import java.util.*

fun processArguments(arguments : List<String>) {

    if (areArgsInError(arguments)) {
        println("error")
        return
    }

    if (arguments.isEmpty() || arguments[0] == "-h") {
        println("XML Bean to Java Bean CLI Tool Help")
        return
    }

    if (arguments.size == 1 && arguments[0].endsWith(".xml")){
        val fileName = arguments[0]
        println("Translating $fileName to java beans")
        return
    }

    val file = File("src\\test\\resources\\properties")

    val props = Properties()
    FileInputStream(file).use { props.load(it) }

    val versionNumber = props.getProperty("version")

    println("xml bean to java bean version $versionNumber")
}

fun areArgsInError(arguments : List<String>) : Boolean {
    if (arguments.size > 1) return true
    return arguments.stream().anyMatch { !Arguments.isAValidArg(it) }
}