package dev.jamiecraane.kotlin15.stdlib.boolean

fun main(args: Array<String>) {
    println("TRUE".toBoolean())
    println("trUE".toBoolean())
    println("oh no".toBoolean())
    println(null.toBoolean())

    println("true".toBooleanStrict())
    println("no".toBooleanStrictOrNull())
    println("tRuE".toBooleanStrict())
}
