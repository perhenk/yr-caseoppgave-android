package com.example.myapp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.myapp.data.models.DayForecast
import com.example.myapp.utils.formatDate

@Composable
fun DailyForecastsPanel(dailyForcasts: List<DayForecast>) {
    Column() {
        dailyForcasts.map {
            DayForecastRow(it)
        }
    }
}

@Composable
fun DayForecastRow(dayForecast: DayForecast){
    Row() {
        Text(formatDate(dayForecast.time))
        WeatherIcon(dayForecast.weatherCode)
        Text("${dayForecast.minTemperature}° - ${dayForecast.maxTemperature}°")
    }
}