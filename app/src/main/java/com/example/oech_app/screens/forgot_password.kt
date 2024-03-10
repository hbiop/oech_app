package com.example.oech_app.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ForgotPasswordScreen() {
    Column(modifier = Modifier.fillMaxSize().padding((screenWidth/50).dp)) {
        Spacer(modifier = Modifier.height((screenHeight/6).dp))
        val mail = remember {
            mutableStateOf("")
        }
        Text(text = "Forgot Password", fontSize = (screenWidth/18).sp)
        SpecialText(text = "Enter your email address")
        Spacer(modifier = Modifier.height((screenHeight/10).dp))
        SpecialText(text = "Email Address")
        SpecialTextBox(placeholder = "mail", enterText = mail)
        Spacer(modifier = Modifier.height((screenHeight/10).dp))
        Button(modifier = Modifier.fillMaxWidth(),onClick = { /*TODO*/ }) {
            Text(text = "Send OTP")
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Text(text = "Remember password? Back to ", fontSize = (screenWidth/30).sp)
            Text(text = "Sign in", fontSize =  (screenWidth/30).sp)
        }
    }
}