package com.example.myapp.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.myapp.data.models.CurrentWeather
import com.example.myapp.utils.weatherDescription


@Composable
fun CurrentWeatherPanel (currentWeather: CurrentWeather){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            WeatherIcon(currentWeather.weathercode)
            Text("${currentWeather.temperature} °")
            Text(weatherDescription(currentWeather.weathercode))
            Text("Vind ${currentWeather.windspeed} km/t")
        }

    }
}