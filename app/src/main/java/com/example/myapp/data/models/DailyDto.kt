package com.example.myapp.data.models

import com.google.gson.annotations.SerializedName


fun DailyDto.toDayForecastList(): List<DayForecast> {
    return time.indices.map { i ->
        DayForecast(
            time = time[i],
            maxTemperature = maxTemperature[i],
            minTemperature = minTemperature[i],
            weatherCode = weatherCode[i],
            precipitation = precipitation[i]
        )
    }
}

data class DailyDto(
    val time: List<String>,

    @SerializedName("temperature_2m_max")
    val maxTemperature: List<Float>,

    @SerializedName("temperature_2m_min")
    val minTemperature: List<Float>,

    @SerializedName("weathercode")
    val weatherCode: List<Int>,

    @SerializedName("precipitation_sum")
    val precipitation: List<Double>
)