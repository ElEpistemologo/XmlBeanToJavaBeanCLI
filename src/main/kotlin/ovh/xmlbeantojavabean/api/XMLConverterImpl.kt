package ovh.xmlbeantojavabean.api

import com.google.common.base.Preconditions
import java.io.File

class XMLConverterImpl : XMLConverter {
    override fun generateJava(file: File) {
        Preconditions.checkArgument(file.exists())
        Preconditions.checkArgument(file.path.endsWith(".xml"))
    }
}