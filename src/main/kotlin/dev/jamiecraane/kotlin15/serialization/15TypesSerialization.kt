package dev.jamiecraane.kotlin15.serialization

import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromJsonElement

@JvmInline
@Serializable
value class FirstName(val value: String)
@JvmInline
@Serializable
value class LastName(val value: String)

@Serializable
data class User3(val firstName: FirstName, val lastName: LastName, val age: UInt)

fun main(args: Array<String>) {
    val user = User3(FirstName("Jan"), LastName("Janssen"), 20U)
    val json = Json.encodeToString(user)
    println(json)

    val decoded = Json.decodeFromString<User3>(json)
    println(decoded)
}
