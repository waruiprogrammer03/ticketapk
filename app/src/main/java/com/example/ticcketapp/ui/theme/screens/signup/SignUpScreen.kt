package com.example.ticcketapp.ui.theme.screens.signup

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ticcketapp.data.AuthViewModel
import com.example.ticcketapp.navigation.LOGIN_URL

@Composable
fun SignupScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Register here")

        var email by remember { mutableStateOf(TextFieldValue("")) }
        var password by remember { mutableStateOf(TextFieldValue("")) }
        var context = LocalContext.current

        OutlinedTextField(value = email , onValueChange = {email=it})

        OutlinedTextField(value = password , onValueChange = {password=it})

        Button(onClick = {
            // HANDLE SIGNUP LOGIC //
            var xyz = AuthViewModel(navController, context)
            xyz.signup(email.text.trim(),password.text.trim())

        }) {
            Text(text = "Signup")
        }

        Button(onClick = {
            navController.navigate(LOGIN_URL)
        }) {
            Text(text = "Have account? Login")
        }
    }
}

@Preview
@Composable
fun SignupScreenPreview() {
    SignupScreen(rememberNavController())
}