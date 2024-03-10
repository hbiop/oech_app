package com.example.oech_app.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.oech_app.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WelcomeBackScreen(){
    Column(verticalArrangement = Arrangement.Center,modifier = Modifier.fillMaxSize().padding(
        (screenWidth/50).dp)) {
        val email = remember {
            mutableStateOf("")
        }
        val password = remember {
            mutableStateOf("")
        }
        val checked = remember {
            mutableStateOf(false)
        }
        Text(text = "Welcome Back", fontSize = (screenWidth/18).sp)
        SpecialText(text = "Fill in your email and password to continue")
        Spacer(modifier = Modifier.height((screenHeight/30).dp))
        SpecialText(text = "Email Address")
        SpecialTextBox(placeholder = "email", enterText = email)
        Spacer(modifier = Modifier.height((screenHeight/30).dp))
        SpecialText(text = "Password")
        SpecialTextBox(placeholder = "********", enterText = password)
        Row(verticalAlignment = Alignment.CenterVertically){
            Checkbox(checked = checked.value, onCheckedChange = {checked.value = !checked.value})
            Text(text = "Remember password", color = Color.Gray)
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "Forgot password?", color = Color.Blue)
        }
        Spacer(modifier = Modifier.height((screenHeight/5).dp))
        Button(modifier = Modifier.fillMaxWidth(),onClick = { /*TODO*/ }) {
            Text(text = "Log in")
        }
        Column(modifier = Modifier.fillMaxWidth(),horizontalAlignment = Alignment.CenterHorizontally) {
            Row(){
                Text(text = "Already have an account?", fontSize = (screenWidth/30).sp)
                Text(text = "Sign in", fontSize =  (screenWidth/30).sp)
            }
            Spacer(modifier = Modifier.height((screenHeight/40).dp))
            Text(text = "or sign in using", fontSize =  (screenWidth/30).sp)
            Spacer(modifier = Modifier.height((screenHeight/40).dp))
            Image(modifier = Modifier.size(width = (screenWidth/15).dp, height = (screenHeight/15).dp),imageVector = ImageVector.vectorResource(id = R.drawable.gicon), contentDescription = null)
        }
    }
}



@Composable
fun PasswordBlock(inputText:MutableState<String>){
    TextField(value = inputText.value, onValueChange = {inputText.value = it})
}