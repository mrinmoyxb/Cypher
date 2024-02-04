package com.example.geminichat.View.Components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.geminichat.ui.theme.montserrat

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarComponent(text: String){
    TopAppBar(title = { Text(text,
        fontSize = 32.sp,
        color = Color.White,
        fontFamily = montserrat,
        fontWeight = FontWeight.SemiBold
    ) },
        modifier = Modifier.fillMaxWidth(),
        colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black)
    )
}


@Preview(showBackground = true)
@Composable
fun DisplayBar(){
    TopAppBarComponent(text = "Cypher")
}