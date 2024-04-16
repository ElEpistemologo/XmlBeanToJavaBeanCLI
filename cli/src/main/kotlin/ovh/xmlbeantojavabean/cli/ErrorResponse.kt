package ovh.xmlbeantojavabean

class ErrorResponse : ResponseProcessor {
    override fun generateResponse(arguments: List<String>) {
        println("error")
    }
}