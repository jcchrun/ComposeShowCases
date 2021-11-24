package com.jchrun.composeshowcases.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.jchrun.composeshowcases.utils.rememberWindowSizeClass

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val windowSizeClass = rememberWindowSizeClass()
            ShowCaseApp(windowSizeClass)
        }
    }
}