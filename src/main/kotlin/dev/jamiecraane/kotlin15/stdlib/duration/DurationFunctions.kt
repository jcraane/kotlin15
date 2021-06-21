package dev.jamiecraane.kotlin15.stdlib.duration

import kotlin.math.sin
import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.TimeSource

@OptIn(ExperimentalTime::class)
fun main(args: Array<String>) {
    val friesCookingTime = Duration.minutes(5)
    val cooldownTime = Duration.seconds(90)
    val desertPrepTime = Duration.minutes(15)

    val total = friesCookingTime + cooldownTime + desertPrepTime
    println(total)
    println(total.inWholeSeconds)

    val markNow = TimeSource.Monotonic.markNow()
    repeat(1_000) {
        sin(it.toDouble())
    }
    println(markNow.elapsedNow())
}
