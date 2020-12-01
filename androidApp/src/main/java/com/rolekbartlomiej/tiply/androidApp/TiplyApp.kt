package com.rolekbartlomiej.tiply.androidApp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rolekbartlomiej.tiply.androidApp.Destinations.Home
import com.rolekbartlomiej.tiply.androidApp.Destinations.Splash
import com.rolekbartlomiej.tiply.androidApp.home.buildHomeScreen
import com.rolekbartlomiej.tiply.androidApp.splash.buildSplashScreen

@Composable
fun TiplyApp() {
    val navController = rememberNavController()
    val actions = remember(navController) { Actions(navController) }
    NavHost(navController = navController, startDestination = Splash.toString()) {
        composable(Splash.toString()) {
            buildSplashScreen(showHome = actions.showHome)
        }
        composable(Home.toString()) {
            buildHomeScreen()
        }

    }
}