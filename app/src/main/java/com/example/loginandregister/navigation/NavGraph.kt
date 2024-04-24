package com.example.loginandregister.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.loginandregister.login.LoginScreen
import com.example.loginandregister.register.RegisterScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {
        composable(route = Screen.Login.route){
            LoginScreen(navController)
        }
        composable(route = Screen.Register.route){
            RegisterScreen(navController)
        }
    }
}

