package com.example.oech_app.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.oech_app.R


var screenWidth: Int = 0
var screenHeight: Int = 0
@Composable
fun Init(){
    screenWidth = LocalConfiguration.current.screenWidthDp
    screenHeight = LocalConfiguration.current.screenHeightDp
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(){
    val fullName = remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
        .padding((screenWidth / 30).dp)) {
        Text(text = "Create an account", fontSize = (screenWidth/18).sp)
        SpecialText(text = "Complete the sign up process to get started")
        Spacer(modifier = Modifier.height((screenHeight/20).dp))
        SpecialText(text = "Full name")
        SpecialTextBox(
            placeholder = "Ivanov Ivan",
            enterText = fullName
        )
        Spacer(modifier = Modifier.height((screenHeight/30).dp))
        SpecialText(text = "Phone number")
        SpecialTextBox(
            placeholder = "Ivanov Ivan",
            enterText = fullName
        )
        Spacer(modifier = Modifier.height((screenHeight/30).dp))
        SpecialText(text = "Email Address")
        SpecialTextBox(
            placeholder = "Ivanov Ivan",
            enterText = fullName
        )
        Spacer(modifier = Modifier.height((screenHeight/30).dp))
        SpecialText(text = "Password")
        SpecialTextBox(
            placeholder = "Ivanov Ivan",
            enterText = fullName
        )
        Spacer(modifier = Modifier.height((screenHeight/30).dp))
        SpecialText(text = "Confirm password")
        SpecialTextBox(
            placeholder = "Ivanov Ivan",
            enterText = fullName
        )
        Spacer(modifier = Modifier.height((screenHeight/20).dp))
        Row(verticalAlignment = Alignment.CenterVertically,horizontalArrangement = Arrangement.SpaceAround,modifier = Modifier.fillMaxWidth()){
            Checkbox(checked = false, onCheckedChange = {})
            Column(verticalArrangement = Arrangement.Center) {
                Row(){
                    Text(text = "By ticking this box, you agree to our", fontSize = (screenWidth/30).sp, color = Color.Gray)
                    Text(text = " Terms and", fontSize = (screenWidth/30).sp, color = Color.Yellow)
                }
                Text(text = "conditions and private policy", fontSize = (screenWidth/30).sp, color = Color.Yellow)
            }
        }
        Spacer(modifier = Modifier.height((screenHeight/10).dp))
        Button(modifier = Modifier
            .fillMaxWidth()
            .height((screenHeight / 15).dp),onClick = {}) {
            Text(text = "Sign Up")
        }
        Spacer(modifier = Modifier.height((screenHeight/40).dp))
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
fun SpecialText(text:String){
    Text(text = text,
        fontSize = (screenWidth/30).sp,
        color = Color.Gray
    )
}

@Composable
fun SpecialTextBox(placeholder:String,enterText: MutableState<String>){
        OutlinedTextField(
            textStyle = TextStyle(fontSize = (screenWidth/30).sp,textAlign = TextAlign.Center),
            value = enterText.value,
            onValueChange = { it -> enterText.value = it },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = Color.Gray,
                containerColor = Color.White,
                focusedLabelColor = Color.Transparent
            ),
            modifier = Modifier
                .size(
                    height = (screenHeight / 14).dp,
                    width = (screenWidth).dp
                ),
            placeholder = { Text(text = placeholder, fontSize = (screenWidth/30).sp) }
        )
}