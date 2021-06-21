package dev.jamiecraane.kotlin15.stdlib.sealed.errorsclasses

sealed class CommonErrors
object ServerError : CommonErrors()
object Forbidden : CommonErrors()
object Unauthorized : CommonErrors()

sealed class LoginErrors {
    data class InvalidUsername(val username: String) : LoginErrors()
    object InvalidPasswordFormat : LoginErrors()
    data class CommonError(val error: CommonErrors) : LoginErrors()
}

sealed class GetUserErrors {
    data class UserNotFound(val userId: String) : GetUserErrors()
    data class InvalidUserId(val userId: String) : GetUserErrors()
    data class CommonError(val error: CommonErrors) : GetUserErrors()
}

fun main(args: Array<String>) {
    val result = handleError(LoginErrors.CommonError(ServerError))
    println(result)
}

private fun handleError(loginError: LoginErrors): String = when (loginError) {
    is LoginErrors.InvalidUsername -> "InvalidUserName"
    LoginErrors.InvalidPasswordFormat -> "InvalidPasswordFormat"
    is LoginErrors.CommonError -> when (loginError.error) {
        Forbidden -> "Forbidden"
        ServerError -> "ServerError"
        Unauthorized -> "Unauthorized"
    }
}

