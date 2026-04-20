package com.example.myapp.data.service

import com.example.myapp.data.models.WeatherForecast
import retrofit2.http.GET

interface WeatherService {
    @GET("forecast")
    suspend fun getForecast(): WeatherForecast
}
