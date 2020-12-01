package com.rolekbartlomiej.tiply.androidApp

import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.rolekbartlomiej.tiply.androidApp.Destinations.Home

object Destinations {
    const val Splash = "splash"
    const val Home = "home"
}

class Actions(navController: NavHostController) {
    val showHome: () -> Unit = {
        navController.navigate(Home)
    }
}