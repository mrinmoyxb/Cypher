package com.example.geminichat.View.Components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.geminichat.ui.theme.montserrat

@Composable
fun ModelChat(prompt: String){
    Column(
        modifier = Modifier.padding(end = 100.dp, bottom = 22.dp)
    ){
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
                .padding(),
            text = prompt,
            fontSize = 18.sp,
            color = Color.Black
        )
    }
}


@Preview(showBackground = true)
@Composable
fun Default(){
    val l1 = listOf(Color(0xFF34a0a4), Color(0xFFb5e48c))
    val l2 = listOf(Color(0xFF03045e), Color(0xFFcaf0f8))
    val l3 = listOf(Color(0xFF4361ee), Color(0xFF64b5f6), Color(0xFFe3f2fd))
    val l4 = listOf(Color(0xFF4ea8de), /*Color(0xFF80ffdb)*/ Color(0xFFe3f2fd))

    val c1: Brush = Brush.linearGradient(l3)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier.height(100.dp).width(250.dp).background(Color.Transparent),
            shape = RoundedCornerShape(20.dp)
        ){
            Box(
                modifier = Modifier.fillMaxSize().background(c1)
            ){
                Text("hello world, demo test", fontSize = 18.sp, fontFamily= montserrat, fontWeight = FontWeight.SemiBold,
                    color = Color.Black, modifier = Modifier.padding(8.dp))
            }
        }
    }
}