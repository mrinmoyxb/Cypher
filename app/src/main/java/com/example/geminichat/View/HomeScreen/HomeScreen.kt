package com.example.geminichat.View.HomeScreen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.geminichat.ViewModel.ChatViewModel

@Composable
fun HomeScreen(){
    val chaViewModel = viewModel<ChatViewModel>()
    val chatState = chaViewModel.chatState.collectAsState().value
}