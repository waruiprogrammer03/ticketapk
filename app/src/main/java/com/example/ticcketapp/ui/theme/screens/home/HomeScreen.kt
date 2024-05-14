package com.example.ticcketapp.ui.theme.screens.home

import android.annotation.SuppressLint
import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ticcketapp.R
import com.example.ticcketapp.navigation.CONCERT_URL
import com.example.ticcketapp.navigation.EVENTS_URL
import com.example.ticcketapp.navigation.HOME_URL
import com.example.ticcketapp.navigation.LOGIN_URL
import com.example.ticcketapp.navigation.MOVIES_URL
import com.example.ticcketapp.navigation.SPORTS_URL

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavHostController,modifier: Modifier = Modifier){
    Box (
        modifier = modifier.fillMaxSize()
    ){
        //Background Image//
        Image(painter = painterResource(id = R.drawable.bb), contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize())
    }
    //End of Background Image//
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val mContext = LocalContext.current
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Home", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black),
            navigationIcon = {
                IconButton(onClick = { navController.navigate(LOGIN_URL)

                }) {
                    Icon(imageVector = Icons.Default.ArrowBack ,
                        contentDescription = "arrow back" ,
                        tint = Color.White)

                }

            }
            ,actions = {

                IconButton(onClick = {
                    val shareIntent= Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))



                }) {
                    Icon(imageVector = Icons.Default.AccountBox ,
                        contentDescription = "share" ,
                        tint = Color.White)

                }

            }

        )
        // End of topappbar
        Spacer(modifier = Modifier.height(30.dp))
        Row {
            Card(modifier = Modifier.size(width = 160.dp, height = 120.dp))
            {
                Column {
                    Box(modifier = Modifier.fillMaxWidth()
                        .clickable { navController.navigate(MOVIES_URL)

                        }, contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.movie),
                            contentDescription = "movies",
                            modifier = Modifier.size(100.dp))
                    }
                    Text(text = "MOVIES",
                        fontSize = 20.sp,
                        color = Color.Blue,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }
            }
            Spacer(modifier = Modifier.width(30.dp))
            Card(modifier = Modifier.size(width = 160.dp, height = 120.dp).clickable { navController.navigate(
                SPORTS_URL)
            })
            {
                Column {
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.shoot),
                            contentDescription = "sports",
                            modifier = Modifier.size(100.dp))
                    }
                    Text(text = "SPORTS",
                        fontSize = 20.sp,
                        color = Color.Blue,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }
            }
        }


        Spacer(modifier = Modifier.height(30.dp))
        // End of row 1
        Row {
            Card(modifier = Modifier.size(width = 160.dp, height = 120.dp))
            {
                Column {
                    Box(modifier = Modifier.fillMaxWidth()
                        .clickable { navController.navigate(CONCERT_URL)
                            Toast.makeText(mContext,"Launching Add Books Screen",
                                Toast.LENGTH_SHORT).show()
                        }, contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.concert),
                            contentDescription = "concert",
                            modifier = Modifier.size(100.dp))
                    }
                    Text(text = "CONCERT",
                        fontSize = 20.sp,
                        color = Color.Blue,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }
            }
            Spacer(modifier = Modifier.width(30.dp))
            Card(modifier = Modifier.size(width = 160.dp, height = 120.dp).clickable { navController.navigate(
                EVENTS_URL)
                Toast.makeText(mContext,"Launching View Books Screen",
                    Toast.LENGTH_SHORT).show()})
            {
                Column {
                    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                        Image(painter = painterResource(id = R.drawable.people),
                            contentDescription = "people",
                            modifier = Modifier.size(100.dp))
                    }
                    Text(text = "Events",
                        fontSize = 20.sp,
                        color = Color.Blue,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }
            }
        }

        // End of row 1

    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen((rememberNavController()))
}

