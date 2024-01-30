package com.example.geminichat.ViewModel

import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.geminichat.Model.Api.ChatData
import com.example.geminichat.Model.Data.ChatClass
import com.example.geminichat.Model.UIData.ChatState
import com.example.geminichat.Model.UIData.UIEvents
import com.google.ai.client.generativeai.Chat
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

// linking chatState and Events
class ChatViewModel: ViewModel(){

    private val _chatState = MutableStateFlow(ChatState())
    val chatState = _chatState.asStateFlow()

    fun onEvent(event: UIEvents){
        when(event){
            is UIEvents.SendPrompt -> {
                if(event.prompt.isNotEmpty()){
                    addPrompt(event.prompt, event.bitmap)
                    if(event.bitmap != null){
                        getResponseWithBitmap(event.prompt, event.bitmap)
                    }
                    else{
                        getResponse(event.prompt)
                    }
                }

            }
            is UIEvents.UpdatePrompt -> {
                _chatState.update {
                    it.copy(prompt = event.newPrompt)
                }
            }
        }
    }

    private fun addPrompt(prompt: String, bitmap: Bitmap?){
        _chatState.update{
            it.copy(chatList = it.chatList.toMutableList().apply {
                add(0, ChatClass(prompt, bitmap, true)) // 0 for UI
            },
                prompt = "",
                bitmap = null
            )
        }
    }

    private fun getResponse(prompt: String){
        viewModelScope.launch{
            val chat = ChatData.getResponse(prompt)
            _chatState.update {
                it.copy(
                    chatList = it.chatList.toMutableList().apply {
                        add(0, chat)
                    }
                )
            }
        }
    }

    private fun getResponseWithBitmap(prompt: String, bitmap: Bitmap){
        viewModelScope.launch{
            val chat = ChatData.getResponseWithImage(prompt, bitmap)
            _chatState.update {
                it.copy(
                    chatList = it.chatList.toMutableList().apply {
                        add(0, chat)
                    }
                )
            }
        }
    }


}