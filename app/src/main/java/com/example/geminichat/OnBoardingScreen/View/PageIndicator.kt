package com.example.geminichat.OnBoardingScreen.View


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PageIndicator(
    modifier: Modifier = Modifier,
    pageSize: Int,
    selectedPage: Int,
    selectedColor: Color = Color.Black,
    unselectedColor: Color = Color.Gray
){
    Row(
        modifier = Modifier,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        // number of indicator based on number of pages
        repeat(pageSize){page->
            Box(modifier = Modifier
                .size(14.dp)
                .clip(CircleShape)
                .background(color = if (page == selectedPage) selectedColor else unselectedColor))
            Spacer(modifier = Modifier.width(5.dp))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DisplayPageIndicator(){
    PageIndicator(pageSize = 3, selectedPage = 1)
}