package com.example.myapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.myapp.data.generateFakeWheaterData
import com.example.myapp.ui.WeatherSurface
import com.example.myapp.ui.components.CurrentWeatherPanel
import com.example.myapp.ui.components.DailyForecastsPanel
import com.example.myapp.ui.theme.YrCaseoppgaveTheme

class MainActivity : ComponentActivity() {


    private val viewModel: WeatherViewModel by viewModels()
    private val fakeData = generateFakeWheaterData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YrCaseoppgaveTheme {
                WeatherSurface(fakeData)
            }
        }
    }
}
