package com.example.ticcketapp.ui.theme.screens.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.ticcketapp.R
import com.example.ticcketapp.navigation.LOGIN_URL
import com.example.ticcketapp.navigation.SIGNUP_URL

@Composable
fun Welcomescreen(
    modifier: Modifier = Modifier,
    navController: NavController
)
{

    Box (
        modifier = modifier.fillMaxSize()
    ){
        //Background Image//
        Image(painter = painterResource(id = R.drawable.bb), contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize())
    }
    //End of Background Image//
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp)

    ) {
        Spacer(modifier = Modifier.weight(1f))

        Image(painter = painterResource(id = R.drawable.ticket),
            contentDescription = null,
            modifier = Modifier
                .width(320.dp)
                .height(240.dp),
            contentScale =  ContentScale.Fit
        )
        Text(text = "WELCOME TO TIKETIA",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight(700),
            color = Color.White
        )
        Text(text = "Skip the lines and book your tickets online for a hassle-free experience.",
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.SansSerif,
            fontSize = 18.sp,
            fontWeight = FontWeight(500),
            color = Color.White
        )

        Spacer(modifier = Modifier.weight(1f))



        Button(onClick = { navController.navigate(LOGIN_URL) },
            shape = MaterialTheme.shapes.large,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.DarkGray
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp)
        ) {
            Text(text = "LOGIN",
                style = TextStyle(
                    fontSize = 22.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
            )

        }
        Row(
            modifier = Modifier
                .padding(top = 12.dp, bottom = 52.dp)
        ){
            Text(text = "DONT HAVE AN ACCOUNT ?",
                style = TextStyle(
                    fontSize = 15.sp,
                    fontFamily = FontFamily.SansSerif,
                    color = Color.White
                )
            )
            Button(onClick = { navController.navigate(SIGNUP_URL) },
                shape = MaterialTheme.shapes.large,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(32.dp)
            ) {
                Text(text = "SignUp",
                    style = TextStyle(
                        fontSize = 11.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold
                    )
                )

            }
        }

    }

}

@Preview(showBackground = true, widthDp = 320, heightDp = 640 )
@Composable
fun welcomescreenpreview() {
    Welcomescreen(navController = rememberNavController())

}