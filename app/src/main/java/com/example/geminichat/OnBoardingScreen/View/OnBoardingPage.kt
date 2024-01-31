package com.example.geminichat.OnBoardingScreen.View

import android.annotation.SuppressLint
import androidx.annotation.ColorRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.geminichat.OnBoardingScreen.Data.OnBoardingData
import com.example.geminichat.OnBoardingScreen.Data.pages
import com.example.geminichat.R
import com.example.geminichat.ui.theme.montserrat

@SuppressLint("ResourceAsColor")
@Composable
fun OnBoardingPage(pages: OnBoardingData, modifier: Modifier = Modifier){
    Column(
        modifier =  modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy((-60).dp)
    ){
        Box(
            contentAlignment = Alignment.Center
        ){
            Image(painter = painterResource(id = pages.image), contentDescription = "On Boarding Page")
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)),
            colors = CardDefaults.cardColors(Color.White)
        ){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 30.dp, start = 30.dp, end = 30.dp)
            ){
                Text(
                    text = pages.heading,
                    fontFamily = montserrat,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center,
                    style = TextStyle(lineHeight = 35.sp)
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = pages.description,
                    fontFamily = montserrat,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFFA89A9A),
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DisplayScreen1(){
    //OnBoardingPage(pages = pages[1])
    OnBoardingScreen()
}


//@Preview(showBackground = true)
//@Composable
//fun DisplayScreen2(){
//    OnBoardingPage(pages = pages[1])
//}

