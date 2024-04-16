package ovh.xmlbeantojavabean.api

import java.io.File

interface XMLConverter {

    fun generateJava(file : File)

}