package ovh.xmlbeantojavabean

import java.util.function.Predicate

enum class Arguments(val isArgument: Predicate<String>, val reponseDelegator: ResponseDelegator) {

    VERSION({ it == "-v" }, VersionResponse()),
    HELP({ it == "-h" }, HelpResponse()),
    NOARG({ it.isEmpty() }, VersionResponse()),
    FILE({ it.endsWith(".xml") }, JavaBeanGenerationResponse());


    companion object {
        fun isAValidArg(arg: String): Boolean = Arguments.entries.stream().anyMatch { it.isArgument.test(arg) }
    }

}