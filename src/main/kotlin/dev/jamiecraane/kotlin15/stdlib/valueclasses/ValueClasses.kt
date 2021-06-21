package dev.jamiecraane.kotlin15.stdlib.valueclasses

@JvmInline
value class FirstName(val value: String)
@JvmInline
value class LastName(val value: String)

fun main(args: Array<String>) {
    testStrings()
    testValueClasses()
}

fun testValueClasses() {
    val firstName = FirstName("Jan")
    val lastName = LastName("Janssen")

    println(getDisplayNameValue(firstName, lastName))
//    println(getDisplayNameValue(lastName, firstName)) // Does not compile
}

private fun testStrings() {
    val firstName = "Jan"
    val lastName = "Janssen"

    println(getDisplayName(firstName, lastName))
    println(getDisplayName(lastName, firstName))
}

fun getDisplayName(firstName: String, lastName: String) = "$firstName $lastName"

fun getDisplayNameValue(firstName: FirstName, lastName: LastName) = "$firstName $lastName"
