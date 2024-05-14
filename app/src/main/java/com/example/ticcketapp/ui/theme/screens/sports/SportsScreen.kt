@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.ticcketapp.ui.theme.screens.localevents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.ticcketapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SportsScreen(){



    val mContext = LocalContext.current

    Column(modifier = Modifier.fillMaxSize()) {

        //TOP APPBAR
        TopAppBar (
            title = { Text(text = "TIKETIA STORES")},
        )
        //END OF TOPAPPBAR

        //Start of Box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Image(
                painter = painterResource(id = R.drawable.ticket),
                contentDescription = "saint",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )


            Spacer(modifier = Modifier.height(20.dp))

        }

        Column (modifier = Modifier
            .verticalScroll(rememberScrollState())
            .padding(10.dp)){

            //Row 1 //
            Row {
                //COLUMN //
                Column {
                    Image(
                        painter = painterResource(
                            id = R.drawable.shoot
                        ),
                        contentDescription = "shirt",
                        modifier = Modifier.size(width = 180.dp, height = 180.dp)
                    )
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Yellow, modifier = Modifier.padding(5.dp))
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Yellow, modifier = Modifier.padding(5.dp))
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Yellow, modifier = Modifier.padding(5.dp))
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Yellow, modifier = Modifier.padding(5.dp))
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Yellow, modifier = Modifier.padding(5.dp))
                    }

                    Text(text = "PAKA VS WEMA", fontSize = 20.sp)
                    Text(text = "800 KSH", fontSize = 20.sp)
                    Text(text = "KASARANI STADIUM", fontSize = 20.sp)
                    OutlinedButton(onClick = {
                        val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        val let = simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                    })
                    {
                        Text(text = "PAY", color = Color.Black)

                    }
                }
                Spacer(modifier = Modifier.width(20.dp))

                Column {
                    Image(
                        painter = painterResource(
                            id = R.drawable.shoot
                        ),
                        contentDescription = "shirt",
                        modifier = Modifier.size(width = 180.dp, height = 180.dp)
                    )
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Yellow, modifier = Modifier.padding(5.dp))
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Yellow, modifier = Modifier.padding(5.dp))
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Yellow, modifier = Modifier.padding(5.dp))
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Yellow, modifier = Modifier.padding(5.dp))
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Black, modifier = Modifier.padding(5.dp))
                    }
                    Text(text = "LITES VS SUDO", fontSize = 20.sp)
                    Text(text = "800 KSH", fontSize = 20.sp)
                    Text(text = "CITY STADIUM", fontSize = 20.sp)
                    OutlinedButton(onClick = {
                        val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        val let = simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                    }) {
                        Text(text = "PAY", color = Color.Black)
                    }
                }
            }
            //END OF ROW 1 //


            //Row 2 //
            Row {
                //COLUMN //
                Column {
                    Image(
                        painter = painterResource(
                            id = R.drawable.shoot
                        ),
                        contentDescription = "shirt",
                        modifier = Modifier.size(width = 180.dp, height = 180.dp)
                    )
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Yellow, modifier = Modifier.padding(5.dp))
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Yellow, modifier = Modifier.padding(5.dp))
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Yellow, modifier = Modifier.padding(5.dp))
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Yellow, modifier = Modifier.padding(5.dp))
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star", tint = Color.Yellow, modifier = Modifier.padding(5.dp))
                    }

                    Text(text = "CID VS KDF", fontSize = 20.sp)
                    Text(text = "800 KSH", fontSize = 20.sp)
                    Text(text = "NYAYO STADIUM", fontSize = 20.sp)
                    OutlinedButton(onClick = {
                        val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        val let = simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                    })
                    {
                        Text(text = "PAY", color = Color.Black)

                    }
                }
                //END OF ROW 2//




            }
        }
    }
    //End of Box

}




@Preview(showBackground = true)
@Composable
fun ExploreActivityPreview(){
    SportsScreen()
}
