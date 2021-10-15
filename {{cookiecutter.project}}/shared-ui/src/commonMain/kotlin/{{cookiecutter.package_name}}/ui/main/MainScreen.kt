package {{cookiecutter.package_name}}.ui.main

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import {{cookiecutter.package_name}}.ui.about.AboutContent
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