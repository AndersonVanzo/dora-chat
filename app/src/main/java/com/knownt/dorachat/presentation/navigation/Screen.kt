package com.knownt.dorachat.presentation.navigation

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object ChatScreen : Screen("chat_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("?name=$arg")
            }
        }
    }
}
