package dev.jamiecraane.kotlin15.datetime

import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDate
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class Person(val name: String, val birthDate: LocalDate)

fun main(args: Array<String>) {
    val jan = Person("Jan", LocalDate(1980, 10, 20))
    println(Json.encodeToString(jan))

    val time = Clock.System.now()
    println(Json.encodeToString(time))
}
