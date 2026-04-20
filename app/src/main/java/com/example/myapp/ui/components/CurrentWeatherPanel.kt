package com.example.myapp.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.example.myapp.data.models.CurrentWeather

@Composable
fun CurrentWeatherPanel (currentWeather: CurrentWeather){
    Box(
        contentAlignment = Alignment.Center,
    ) {
        WeatherIcon(currentWeather.weathercode)
    }
}