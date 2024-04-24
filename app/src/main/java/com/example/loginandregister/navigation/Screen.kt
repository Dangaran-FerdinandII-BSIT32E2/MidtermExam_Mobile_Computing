package com.example.loginandregister.navigation

sealed class Screen(val route: String) {
    data object Login: Screen("login")
    data object Register: Screen("register")
}