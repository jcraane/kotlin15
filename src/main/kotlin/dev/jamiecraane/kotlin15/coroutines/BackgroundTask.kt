package dev.jamiecraane.kotlin15.coroutines

import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class)
fun main(args: Array<String>) = runBlocking<Unit> {
    val job = GlobalScope.launch {
        while (true) {

            println("Do Iets")
            delay(1000)
        }
    }

    job.join()
}
