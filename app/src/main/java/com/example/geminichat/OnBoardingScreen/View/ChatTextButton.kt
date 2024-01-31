package com.example.geminichat.OnBoardingScreen.View

import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.geminichat.ui.theme.montserrat

@Composable
fun ChatTextButton(text: String, onClick: () -> Unit) {
    TextButton(
        onClick = onClick
    ){
        Text(text = text,
            fontFamily = montserrat,
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.White
        )
    }
}