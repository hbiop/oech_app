package com.example.oech_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.oech_app.screens.ForgotPasswordScreen
import com.example.oech_app.screens.Init
import com.example.oech_app.screens.SignUpScreen
import com.example.oech_app.screens.WelcomeBackScreen
import com.example.oech_app.ui.theme.Oech_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Oech_appTheme {
                Init()
                ForgotPasswordScreen()
            }
        }
    }
}

