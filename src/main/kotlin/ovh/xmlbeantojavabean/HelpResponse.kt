package ovh.xmlbeantojavabean

class HelpResponse : ResponseDelegator {
    override fun generateResponse(arguments: List<String>) {
        println("XML Bean to Java Bean CLI Tool Help")
    }
}