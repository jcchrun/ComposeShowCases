package com.jchrun.composeshowcases.ui.nav

import androidx.navigation.NavController

interface Navigator {

    fun navigateToHome()
}

class DefaultNavigator(private val navController: NavController): Navigator {

    override fun navigateToHome() {
        navController.navigate(Routes.HOME.routeName) {
            popUpTo(Routes.SPLASH.routeName) {
                inclusive = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }
}