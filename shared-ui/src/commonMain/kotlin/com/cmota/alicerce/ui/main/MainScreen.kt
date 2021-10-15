package com.cmota.alicerce.ui.main

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.cmota.alicerce.ui.about.AboutContent
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState

@Composable
fun MainScreen() {

    Scaffold(
        topBar = {
            //MainTopAppBar()
        },
        content = {


            val swipeRefreshState = rememberSwipeRefreshState(isRefreshing = false)

            SwipeRefresh(
                state = swipeRefreshState,
                onRefresh = {}
            ) {
                AboutContent()
            }
        }
    )
}