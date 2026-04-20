package com.example.myapp.data

data class WeatherForecast(
    val latitude: Double,
    val longitude: Double,
    val generationtime_ms: Double,
    val utc_offset_seconds: Integer,
    val timezone: String,
    val timezone_abbreviation: String,
    val elevation: Float
)
