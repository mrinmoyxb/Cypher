package com.example.geminichat.View.Components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ChatScreen(paddingValues: PaddingValues){
    Column(
        modifier = Modifier.fillMaxSize().padding(top = paddingValues.calculateTopPadding()),
        verticalArrangement = Arrangement.C
    ){

    }
}