package dev.jamiecraane.kotlin15.stdlib.characters

fun main(args: Array<String>) {
    var A = 'A'
    var four = '4'

    println(A.code)
    println(four.code)

    println(Char(66))

    println(four.digitToInt())
    println(A.digitToIntOrNull())
    println(A.digitToIntOrNull(16))
}
