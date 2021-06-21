package dev.jamiecraane.kotlin15.coroutines

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@OptIn(DelicateCoroutinesApi::class)
fun main(args: Array<String>) = runBlocking<Unit> {
    GlobalScope.launch {
        println("Hello")
    }
}
