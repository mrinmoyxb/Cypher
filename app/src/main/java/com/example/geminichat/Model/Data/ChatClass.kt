package com.example.geminichat.Model.Data

import android.graphics.Bitmap

data class ChatClass(
    val prompt: String,
    val bitmap: Bitmap?,
    val isFromUser: Boolean
)