package com.rolekbartlomiej.tiply.androidApp.splash

import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.rolekbartlomiej.tiply.androidApp.greet

@Composable
fun buildSplashScreen(showHome: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = greet())
        Handler(Looper.getMainLooper()).postDelayed({ showHome() }, 1500)
    }
}