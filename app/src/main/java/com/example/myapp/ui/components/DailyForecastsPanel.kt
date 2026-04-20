package com.example.myapp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.myapp.data.models.DayForecast

@Composable
fun DailyForecastsPanel(dailyForcasts: List<DayForecast>) {
    Column() {
        dailyForcasts.map {
            Text(it.time)
        }
    }
}