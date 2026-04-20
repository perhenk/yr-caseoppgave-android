package com.example.myapp.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import com.example.myapp.data.models.DayForecast
import com.example.myapp.utils.formatDate

@Composable
fun DailyForecastsPanel(dailyForecasts: List<DayForecast>,onItemClick: (DayForecast) -> Unit) {
    Text("7-dagers varsel")
    LazyColumn(modifier= Modifier.fillMaxSize()) {
        items(dailyForecasts){ data -> DayForecastRow(data,onItemClick)}
        }
}


@Composable
fun DayForecastRow(dayForecast: DayForecast, onClick: (DayForecast) -> Unit){
    Row (
        modifier = Modifier
            .clickable{onClick(dayForecast)}
            .drawBehind() {
            val strokeWidth = 1.dp.toPx()

            // Top line
            drawLine(
                color = Color.Gray,
                start = Offset(0f, 0f),
                end = Offset(size.width, 0f),
                strokeWidth = strokeWidth
            )
            // Bottom line
            drawLine(
                color = Color.Gray,
                start = Offset(0f, size.height),
                end = Offset(size.width, size.height),
                strokeWidth = strokeWidth
            )
        }
    ){
        Text(formatDate(dayForecast.time), modifier = Modifier.padding(16.dp))
        WeatherIcon(dayForecast.weatherCode)
        Spacer(modifier = Modifier.weight(1f))
        Text("${dayForecast.minTemperature}° - ${dayForecast.maxTemperature}°",  modifier = Modifier.padding(16.dp))
    }
}