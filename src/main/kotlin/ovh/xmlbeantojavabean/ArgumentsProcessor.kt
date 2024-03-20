package ovh.xmlbeantojavabean

fun processArguments(arguments: List<String>) {

    if (areArgsInError(arguments)) {
        val errorResponse = ErrorResponse()
        errorResponse.generateResponse(arguments)
        return
    }

    if (arguments.isEmpty() || arguments[0] == "-h") {
        val helpResponse = HelpResponse()
        helpResponse.generateResponse(arguments)
        return
    }

    if (arguments.size == 1 && arguments[0].endsWith(".xml")) {
        val javaBeanGenerationResponse = JavaBeanGenerationResponse()
        javaBeanGenerationResponse.generateResponse(arguments)
        return
    }

    if (arguments.size == 1 && arguments[0] == "-v") {
        val versionResponse = VersionResponse()
        versionResponse.generateResponse(arguments)
    }

}

fun areArgsInError(arguments: List<String>): Boolean {
    if (arguments.size > 1) return true
    return arguments.stream().anyMatch { !Arguments.isAValidArg(it) }
}