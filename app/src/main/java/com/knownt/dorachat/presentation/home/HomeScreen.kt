package com.knownt.dorachat.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.knownt.dorachat.presentation.navigation.Screen

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 50.dp)
    ) {
        Text(text = "Home screen")
        Button(onClick = {
            navController.navigate(Screen.ChatScreen.route)
        }) {
            Text(text = "Go to Chat")
        }
        Button(onClick = {
            navController.navigate(Screen.ChatScreen.withArgs("Joe"))
        }) {
            Text(text = "Go to Chat with Joe")
        }
    }
}