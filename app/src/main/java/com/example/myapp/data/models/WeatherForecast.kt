package com.example.myapp.data.models

data class WeatherForecast(
    val latitude: Double,
    val longitude: Double,
    val generationtime_ms: Double,
    val utc_offset_seconds: Int,
    val timezone: String,
    val timezone_abbreviation: String,
    val elevation: Double,

    val currentWeather_units: CurrentWeatherUnits,
    val currentWeather: CurrentWeather,
    val dailyUnits: DailyUnits,
    val dailyForecasts: List<DayForecast>
)