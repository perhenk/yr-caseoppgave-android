package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.myapp.ui.WeatherScreen
import com.example.myapp.ui.theme.YrCaseoppgaveTheme

class MainActivity : ComponentActivity() {

    private val weatherViewModel: WeatherViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YrCaseoppgaveTheme {
                WeatherScreen()

            }
        }
    }
}
