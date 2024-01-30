package com.example.geminichat.Model.UIData

import android.graphics.Bitmap
import com.example.geminichat.Model.Data.ChatClass
import com.google.ai.client.generativeai.Chat


data class ChatState(
    val chatList: MutableList<ChatClass> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)
