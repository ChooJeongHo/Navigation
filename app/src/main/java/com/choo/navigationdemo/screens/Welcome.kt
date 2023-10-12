package com.choo.navigationdemo.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.choo.navigationdemo.NavRoutes

@Composable
fun Welcome(navController: NavController, userName: String?) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Welcome, $userName", style = MaterialTheme.typography.h5)

            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = {
                navController.navigate(NavRoutes.Profile.route) {
                    popUpTo(NavRoutes.Home.route)
                }
            }) {
                Text(text = "Set up your profile")
            }
        }
    }
}
