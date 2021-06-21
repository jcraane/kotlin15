package dev.jamiecraane.kotlin15.serialization

import dev.jamiecraane.kotlin15.stdlib.collection.User
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.*

@Serializable
data class User2(val name: String, val yearOfBirth: Int)

fun main(args: Array<String>) {
    val user = User2("Jamie", 1978)

    val json = Json.encodeToString(user)
    println(json)

    val decoded = Json.decodeFromString<User2>(json)
    println(decoded)
}
