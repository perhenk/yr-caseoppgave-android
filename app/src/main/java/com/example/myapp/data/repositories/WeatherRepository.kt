package com.example.myapp.data.repositories

import com.example.myapp.data.models.WeatherForecast
import com.example.myapp.data.service.WeatherAPIClient

class WeatherRepository {

    suspend fun getWeatherForecast(): WeatherForecast{
        return WeatherAPIClient.apiService.getForecast()
    }
}