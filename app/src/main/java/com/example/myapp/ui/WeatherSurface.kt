package com.example.myapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapp.data.models.WeatherForecast
import com.example.myapp.ui.components.CurrentWeatherPanel
import com.example.myapp.ui.components.DailyForecastsPanel
import com.example.myapp.ui.components.DayForecastDetails

@Composable
fun WeatherSurface (weatherForecastData: WeatherForecast){

    val navController = rememberNavController()

    Surface(modifier = Modifier.fillMaxSize()) {
        NavHost(navController = navController, startDestination = "list") {
            composable("list") {
                Column ( verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    Text("PH's yr app")
                    CurrentWeatherPanel(weatherForecastData.currentWeather)
                    DailyForecastsPanel(weatherForecastData.dailyForecasts,
                        onItemClick = {forecast -> navController.navigate("details")})
                }
            }
            composable("details") {
                Column(verticalArrangement = Arrangement.spacedBy(10.dp)) { }
                DayForecastDetails(navController=navController)
            }
        }
    }
}