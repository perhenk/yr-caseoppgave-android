package com.example.myapp.data.models

import com.google.gson.annotations.SerializedName

data class WeatherForecast(
    val latitude: Double,
    val longitude: Double,
    val generationtime_ms: Double,
    val utc_offset_seconds: Int,
    val timezone: String,
    val timezone_abbreviation: String,
    val elevation: Double,
    val currentWeather_units: CurrentWeatherUnits,
    @SerializedName("current_weather")
    val currentWeather: CurrentWeather,
    val dailyUnits: DailyUnits,
    @SerializedName("daily")
    val dailyForecasts: DailyDto
)