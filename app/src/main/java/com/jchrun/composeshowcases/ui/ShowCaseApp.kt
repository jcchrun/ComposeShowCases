package com.jchrun.composeshowcases.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jchrun.composeshowcases.ui.home.HomeScreen
import com.jchrun.composeshowcases.ui.nav.DefaultNavigator
import com.jchrun.composeshowcases.ui.nav.Routes
import com.jchrun.composeshowcases.ui.splash.SplashScreen
import com.jchrun.composeshowcases.ui.theme.ComposeShowCasesTheme
import com.jchrun.composeshowcases.utils.WindowSize

@Composable
fun ShowCaseApp(
    windowSize: WindowSize
) {

    ComposeShowCasesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Navigation()
        }
    }

}

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val navigator = DefaultNavigator(navController = navController)
    NavHost(navController = navController,
        startDestination = Routes.SPLASH.routeName) {
        composable(Routes.SPLASH.routeName) {
            SplashScreen(navigator)
        }
        composable(Routes.HOME.routeName) {
            HomeScreen(navigator)
        }
    }
}
