package com.example.geminichat.OnBoardingScreen.Data

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

data class OnBoardingData(
    //val image: Painter,
    val heading: String,
    val description: String,
)

val pages = listOf(
    OnBoardingData(
        heading = "Unleash Your Creativity with Text & Image Prompts",
        description = "Go beyond words with Cypher, Tell a story, use picture as a prompt, or write a song – the possibilities are endless"
    ),

    OnBoardingData(
        heading = " Experience the Power of Gemini Pro",
        description = "Our app is fueled by Gemini, a cutting-edge AI technology from Google. This neural network understands your text and images, unlocking a world of creative possibilities you never imagined."
    ),

    OnBoardingData(
        heading = "What Story Will You Tell Today? Explore the Endless Possibilities",
        description = "A universe of words awaits. Dive into the world of prompts and discover the creative magic Cypher unlocks within you"
    ),
)
