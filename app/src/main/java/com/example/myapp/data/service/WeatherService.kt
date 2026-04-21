package com.example.myapp.data.service

import com.example.myapp.data.models.WeatherForecast
import retrofit2.http.GET

interface WeatherService {
    @GET("forecast?latitude=67.28&longitude=14.38&daily=temperature_2m_max,temperature_2m_min,weathercode,precipitation_sum&current_weather=true&timezone=Europe%2FOslo&models=metno_seamless")
    suspend fun getForecast(): WeatherForecast
}
