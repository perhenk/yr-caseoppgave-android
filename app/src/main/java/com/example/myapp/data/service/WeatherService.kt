package com.example.myapp.data.service

import com.example.myapp.data.models.WeatherForecast
import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherService {
    @GET("forecast")
    suspend fun getForecast(
        @Query("latitude") latitude: Double = 59.91,
        @Query("longitude") longitude: Double = 10.75,
        @Query("daily") daily: String = "temperature_2m_max,temperature_2m_min,weathercode,precipitation_sum",
        @Query("current_weather") currentWeather: Boolean = true,
        @Query("timezone") timezone: String = "Europe/Oslo",
        @Query("models") models: String = "metno_seamless"
    ): WeatherForecast
}
