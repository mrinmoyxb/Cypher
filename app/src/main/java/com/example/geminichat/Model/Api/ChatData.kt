package com.example.geminichat.Model.Api

import android.graphics.Bitmap
import com.example.geminichat.Model.Data.ChatClass
import com.google.ai.client.generativeai.BuildConfig
import com.google.ai.client.generativeai.Chat
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.ResponseStoppedException
import com.google.ai.client.generativeai.type.content
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.example.geminichat.BuildConfig.API_KEY


object ChatData {
    const val key = API_KEY

    //prompt from user -> text prompt
    suspend fun getResponse(prompt: String): ChatClass {
        val generativeModel = GenerativeModel(
            modelName = "gemini-pro", apiKey = key
        )

        try{
            val response = withContext(Dispatchers.IO){
                generativeModel.generateContent(prompt)
            }

            return ChatClass(
                prompt = response.text?:"error",
                bitmap = null,
                isFromUser = false
            )
        } catch(e: Exception){
            return ChatClass(
                prompt = e.message?:"error",
                bitmap = null,
                isFromUser = false
            )
        }
    }

    //prompt from user -> image prompt
    suspend fun getResponseWithImage(prompt: String, bitmap: Bitmap): ChatClass {
        val generativeModel = GenerativeModel(
            modelName = "gemini-pro-vision", apiKey = key
        )

        try{
            val inputContent = content{
                image(bitmap)
                text(prompt)
            }
            val response = withContext(Dispatchers.IO){
                generativeModel.generateContent(inputContent)
            }

            return ChatClass(
                prompt = response.text?:"error",
                bitmap = null,
                isFromUser = false
            )
        } catch(e: Exception){
            return ChatClass(
                prompt = e.message?:"error",
                bitmap = null,
                isFromUser = false
            )
        }
    }
}