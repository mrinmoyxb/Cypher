package com.example.geminichat.OnBoardingScreen.Data

import androidx.annotation.DrawableRes
import com.example.geminichat.R

data class OnBoardingData(
    @DrawableRes val image: Int,
    val heading: String,
    val description: String,
)

val pages = listOf(
    OnBoardingData(
        image = R.drawable.p1,
        heading = "Unleash Your Creativity with Text & Image Prompts",
        description = "Tell a story, use picture as a prompt, or write a song – the possibilities are endless"
    ),

    OnBoardingData(
        image = R.drawable.p2,
        heading = "Experience the Power of Gemini Pro",
        description = "Our app is fueled by Gemini, from Google. This neural network understands your text and images, unlocking a world you never imagined."
    ),

    OnBoardingData(
        image = R.drawable.p1,
        heading = "What Story Will You Tell Today? Explore the Endless Possibilities",
        description = "A universe of words awaits. Dive into the world of prompts and discover the creative magic Cypher unlocks within you"
    ),
)
