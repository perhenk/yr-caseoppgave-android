package com.example.myapp.data.models

import com.google.gson.annotations.SerializedName

data class DayForecast(
    val time: String,
    @SerializedName("temperature_2m_max")
    val maxTemperature: Float,
    @SerializedName("temperature_2m_min")
    val minTemperature: Float,
    @SerializedName("weathercode")
    val weatherCode: Int,
    @SerializedName("precipitation_sum")
    val precipitation: Double
)
