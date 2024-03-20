package ovh.xmlbeantojavabean

class JavaBeanGenerationResponse : ResponseDelegator {
    override fun generateResponse(arguments: List<String>) {
        val fileName = arguments[0]
        println("Translating $fileName to java beans")
    }
}