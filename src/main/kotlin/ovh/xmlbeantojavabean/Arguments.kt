package ovh.xmlbeantojavabean

import java.util.function.Predicate

enum class Arguments(val isArgument: Predicate<List<String>>, val responseDelegator: ResponseProcessor) {

    VERSION({ it.isNotEmpty() && it[0] == "-v" }, VersionResponse()),
    HELP({ it.isNotEmpty() && it[0] == "-h" }, HelpResponse()),
    NO_ARG({ it.isEmpty() }, HelpResponse()),
    FILE({ it.isNotEmpty() && it[0].endsWith(".xml") }, JavaBeanGenerationResponse());


    companion object {
        fun isAValidArg(args: List<String>): Boolean = Arguments.entries.stream().anyMatch { it.isArgument.test(args) }
    }

}