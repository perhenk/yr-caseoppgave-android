package com.example.myapp.data.models

import com.google.gson.annotations.SerializedName

data class CurrentWeather(
    val time: String,
    val interval: Int,
    val temperature: Double,
    val windspeed: Double,

    @SerializedName("is_day")
    val isDay: Int,
    @SerializedName("weatherCode")
    val weatherCode: Int,
    val winddirection: Int
)