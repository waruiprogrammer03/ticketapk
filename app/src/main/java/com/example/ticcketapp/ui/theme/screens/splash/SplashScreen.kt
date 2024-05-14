package com.example.ticcketapp.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ticcketapp.R
import com.example.ticcketapp.navigation.HOME_URL
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navHostController: NavHostController) {

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        val coroutine = rememberCoroutineScope()
        coroutine.launch {
            delay(2000)
            navHostController.navigate(HOME_URL)
        }

        Image(
            painter = painterResource(id = R.drawable.ticket),
            contentDescription = "splash",
            modifier = Modifier
                .size(width = 90.dp, height = 75.dp)
                .size(100.dp))

        Text(
            text = "WELCOME TO TICKET",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.padding()
        )
    }

}
@Preview(showBackground = true)
@Composable
fun SplashScreen(){
    SplashScreen(rememberNavController())
}