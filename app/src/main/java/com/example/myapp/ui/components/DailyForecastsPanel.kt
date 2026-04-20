package com.example.myapp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapp.data.models.DayForecast
import com.example.myapp.utils.formatDate

@Composable
fun DailyForecastsPanel(dailyForcasts: List<DayForecast>) {
    LazyColumn(modifier= Modifier.fillMaxSize()) {
        items(dailyForcasts){data -> DayForecastRow(data)}
        }
}


@Composable
fun DayForecastRow(dayForecast: DayForecast){
    Row {
        Text(formatDate(dayForecast.time), modifier = Modifier.padding(16.dp))
        WeatherIcon(dayForecast.weatherCode)
        Spacer(modifier = Modifier.weight(1f))
        Text("${dayForecast.minTemperature}° - ${dayForecast.maxTemperature}°",  modifier = Modifier.padding(16.dp))
    }
}