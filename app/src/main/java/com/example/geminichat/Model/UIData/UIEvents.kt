package com.example.geminichat.Model.UIData

import android.graphics.Bitmap

sealed class UIEvents{
        data class UpdatePrompt(val newPrompt: String): UIEvents()
        data class SendPrompt(val prompt: String, val bitmap: Bitmap?): UIEvents()
}
