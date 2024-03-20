package ovh.xmlbeantojavabean

class HelpResponse : ResponseProcessor {
    override fun generateResponse(arguments: List<String>) {
        println("XML Bean to Java Bean CLI Tool Help")
    }
}