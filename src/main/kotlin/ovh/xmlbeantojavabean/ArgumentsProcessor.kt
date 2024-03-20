package ovh.xmlbeantojavabean

fun processArguments(arguments: List<String>) {

    if (areArgsInError(arguments)) {
        val errorResponse = ErrorResponse()
        errorResponse.generateResponse(arguments)
        return
    }

    if (arguments.isEmpty()) {
        val helpResponse = HelpResponse()
        helpResponse.generateResponse(arguments)
        return
    }

    val firstArgument = arguments[0]

    Arguments.entries.stream()
        .filter { it.isArgument.test(firstArgument) }
        .findFirst()
        .ifPresent { it.reponseDelegator.generateResponse(arguments) }


}

fun areArgsInError(arguments: List<String>): Boolean {
    if (arguments.size > 1) return true
    return arguments.stream().anyMatch { !Arguments.isAValidArg(it) }
}