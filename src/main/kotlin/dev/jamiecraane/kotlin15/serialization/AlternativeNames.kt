package dev.jamiecraane.kotlin15.serialization

import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonNames
import org.intellij.lang.annotations.Language


fun main(args: Array<String>) {
    @Language("JSON") val json1 = """
        {
          "name": "Jan"
        }
    """.trimIndent()

    @Language("JSON") val json2 = """
        {
          "title": "Jan"
        }
    """.trimIndent()

    val u1 = Json.decodeFromString<User>(json1)
    val u2 = Json.decodeFromString<User>(json2)
    println(u1)
    println(u2)
}

@Serializable
data class User(@JsonNames(names = arrayOf("title")) val name: String)
