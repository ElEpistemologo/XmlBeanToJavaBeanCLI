package ovh.xmlbeantojavabean

import java.util.function.Predicate

enum class Arguments(val isArgument: Predicate<String>) {

    VERSION({ it == "-v" }),
    HELP({it == "-h"}),
    NOARG({ it.isEmpty() }),
    FILE({ it.endsWith(".xml") });


    companion object {
        fun isAValidArg(arg : String) : Boolean = Arguments.entries.stream().anyMatch { it.isArgument.test(arg)}
    }

}