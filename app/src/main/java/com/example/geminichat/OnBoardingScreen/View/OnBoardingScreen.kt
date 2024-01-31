package com.example.geminichat.OnBoardingScreen.View

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.geminichat.OnBoardingScreen.Data.pages
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen(){
    Column(modifier = Modifier.fillMaxSize()){
        val pagerState = rememberPagerState()
        
        val buttonState = remember{
            derivedStateOf { 
                when(pagerState.currentPage){
                    0 -> listOf("", "Next")
                    1 -> listOf("Back", "Next")
                    2 -> listOf("Back", "Getting Started")
                    else -> listOf("")
                }
            }
        }
        Box(
            modifier = Modifier.fillMaxHeight(0.8f).fillMaxWidth()
        ) {

            HorizontalPager(pageCount = 3, state = pagerState) { index ->
                OnBoardingPage(pages = pages[index])
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .navigationBarsPadding(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
            ){

            PageIndicator(
                modifier = Modifier.width(12.dp),
                pageSize = pages.size,
                selectedPage = pagerState.currentPage
            )

            Row(verticalAlignment = Alignment.CenterVertically){
                val scope = rememberCoroutineScope()
                if(buttonState.value[0].isNotEmpty()){
                    ChatTextButton(text = buttonState.value[0],
                        onClick = {
                            scope.launch{
                                pagerState.animateScrollToPage(page = pagerState.currentPage)
                            }
                        }
                    )
                }
                ChatTextButton(text = buttonState.value[1],
                    onClick = {
                        scope.launch{
                            if(pagerState.currentPage == 3){
                                //* TODO
                            }
                            else{
                                pagerState.animateScrollToPage(
                                    page = pagerState.currentPage+1
                                )
                            }
                        }
                    }
                )

            }

        }

    }
}


@Preview(showBackground = true)
@Composable
fun Display(){
    OnBoardingScreen()
}


