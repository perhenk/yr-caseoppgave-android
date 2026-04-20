package com.example.myapp.data.models

data class DailyUnits(
    val time: String,
    val temperature_2m_max: String,
    val temperature_2m_min: String,
    val weathercode: String,
    val precipitation_sum: String
)
