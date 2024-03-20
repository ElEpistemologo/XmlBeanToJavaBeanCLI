package ovh.xmlbeantojavabean

class ErrorResponse : ResponseDelegator {
    override fun generateResponse(arguments: List<String>) {
        println("error")
    }
}