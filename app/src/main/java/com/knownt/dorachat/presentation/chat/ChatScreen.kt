package com.knownt.dorachat.presentation.chat

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
fun ChatScreen(navController: NavController, name: String?) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 50.dp)
    ) {
        Text(text = "Chat with $name")
        Button(onClick = {
            navController.navigate(Screen.HomeScreen.route)
        }) {
            Text(text = "Go to Home")
        }
    }
}