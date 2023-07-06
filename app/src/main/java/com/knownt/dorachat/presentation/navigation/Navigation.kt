package com.knownt.dorachat.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.knownt.dorachat.presentation.chat.ChatScreen
import com.knownt.dorachat.presentation.home.HomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.ChatScreen.route + "?name={name}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    defaultValue = "Default"
                    nullable = true
                }
            )
        ) { entry ->
            ChatScreen(navController = navController, name = entry.arguments?.getString("name"))
        }
    }
}