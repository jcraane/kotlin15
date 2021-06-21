package dev.jamiecraane.kotlin15.stdlib.sealed.errorsclasses

sealed class CommonErrors2 : LoginErrors2, GetUserErrors2 // extend both hierarchies 👍
object ServerError2 : CommonErrors2()
object Forbidden2 : CommonErrors2()
object Unauthorized2 : CommonErrors2()

sealed interface LoginErrors2 {
    data class InvalidUsername(val username: String) : LoginErrors2
    object InvalidPasswordFormat : LoginErrors2
}

sealed interface GetUserErrors2 {
    data class UserNotFound(val userId: String) : GetUserErrors2
    data class InvalidUserId(val userId: String) : GetUserErrors2
}

fun main(args: Array<String>) {
    val result = handleLoginError(LoginErrors2.InvalidPasswordFormat)
    println(result)
}

fun handleLoginError(error: LoginErrors2): String = when (error) {
    Forbidden2 -> "Forbidden2"
    ServerError2 -> "ServerError2"
    Unauthorized2 -> "Unauthorized2"
    LoginErrors2.InvalidPasswordFormat -> "InvalidPasswordFormat"
    is LoginErrors2.InvalidUsername -> "InvalidUsername"
}
