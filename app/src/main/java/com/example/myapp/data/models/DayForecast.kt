package com.example.myapp.data.models

data class DayForecast(
    val time: String,
    val maxTemperature: Float,
    val minTemperature: Float,
    val weatherCode: Int,
    val precipitation: Double
)
