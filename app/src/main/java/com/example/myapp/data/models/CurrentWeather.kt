package com.example.myapp.data.models

data class CurrentWeather(
    val time: String,
    val interval: Int,
    val temperature: Double,
    val windspeed: Double,
    val is_day: Int,
    val weathercode: Int
)