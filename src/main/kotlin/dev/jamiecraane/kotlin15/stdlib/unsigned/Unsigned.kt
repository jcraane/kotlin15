package dev.jamiecraane.kotlin15.stdlib.unsigned

import kotlin.random.Random
import kotlin.random.nextULong


fun main(args: Array<String>) {
    val unsigedForty = 40.toUInt()
    val unsigned42 = 42u

    Random.nextULong()

    println(Integer.MAX_VALUE)
    println(UInt.MAX_VALUE)

    val red = 0xFFu

    val number = 3405691582
    println(number.toString(2))
}
