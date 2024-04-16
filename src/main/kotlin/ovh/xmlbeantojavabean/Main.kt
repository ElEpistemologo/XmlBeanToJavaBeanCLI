package ovh.xmlbeantojavabean

fun main(args: Array<String>) {
    processArguments(args.toList())
}

fun processArguments(arguments: List<String>) {

    if (areArgsInError(arguments)) {
        val errorResponse = ErrorResponse()
        errorResponse.generateResponse(arguments)
        return
    }

    Arguments.entries.stream()
        .filter { it.isArgument.test(arguments) }
        .findFirst()
        .ifPresent { it.responseDelegator.generateResponse(arguments) }

}

fun areArgsInError(arguments: List<String>): Boolean {
    if (arguments.size > 1) return true
    return !Arguments.isAValidArg(arguments)
}