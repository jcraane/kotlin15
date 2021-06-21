package dev.jamiecraane.kotlin15.stdlib.sealed

data class ZoomIn(val amount: Int): Event()
data class ZoomOut(val amount: Int): Event()

fun main(args: Array<String>) {
    val event: Event = ZoomIn(5)

    val result = when (event) {
        is ZoomIn -> "ZoomIn"
        is ZoomOut -> "ZoomOut"
    }

    println(result)
}

