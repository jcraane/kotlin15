package dev.jamiecraane.kotlin15.stdlib.collection

val users = listOf(
    User("Jan", null),
    User("Kees", null),
    User("Klaas", 30),
    User("Piet", 31)
)

data class User(val name: String, val age:Int?)

fun main(args: Array<String>) {
    val firstAge = users.mapNotNull { it.age }.firstOrNull()
    println(firstAge)

    println(users.firstNotNullOfOrNull { it.age })
}
