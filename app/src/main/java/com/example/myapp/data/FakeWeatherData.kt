package com.example.myapp.data

import com.example.myapp.data.models.CurrentWeather
import com.example.myapp.data.models.CurrentWeatherUnits
import com.example.myapp.data.models.DailyUnits
import com.example.myapp.data.models.DayForecast
import com.example.myapp.data.models.WeatherForecast

// Falske testdata — alternativ til Retrofit
//
// Hvis du ikke får Retrofit til å fungere,
// kan du bruke disse verdiene direkte i stedet for et API-kall.
//
// Tilpass klassenavnene til dine egne dataklasser — det er ingen krav til
// hvordan du kaller dem eller strukturerer dem.
//
// Eksempel på bruk:
//
//   val currentWeather = CurrentWeather(
//       temperature  = 4.0f,
//       windSpeed    = 7.5f,
//       weatherCode  = 3
//   )
//


fun generateFakeWheaterData(): WeatherForecast{
    val dailyForecasts = listOf<DayForecast>(
        DayForecast("2026-04-09", maxTemperature =  4.0f, minTemperature =  0.0f, weatherCode =  3, precipitation = 0.0),
        DayForecast("2026-04-10", maxTemperature =  6.0f, minTemperature =  1.0f, weatherCode = 61, precipitation = 3.2),
        DayForecast("2026-04-11", maxTemperature =  3.0f, minTemperature = -1.0f, weatherCode = 71, precipitation = 5.0),
        DayForecast("2026-04-12", maxTemperature =  2.0f, minTemperature = -3.0f, weatherCode = 75, precipitation = 8.1),
        DayForecast("2026-04-13", maxTemperature =  5.0f, minTemperature =  0.0f, weatherCode =  2, precipitation = 0.0),
        DayForecast("2026-04-14", maxTemperature =  9.0f, minTemperature =  2.0f, weatherCode =  0, precipitation = 0.0),
        DayForecast("2026-04-15", maxTemperature =  8.0f, minTemperature =  1.0f, weatherCode = 80, precipitation = 4.5),
    )
    val currentWeatherUnits = CurrentWeatherUnits(
        time= "iso8601",
        interval = "seconds",
        temprature = "°C",
        windspeed = "km/h",
        winddirection = "°",
        is_day = "",
        weathercode = "wmo code"
    )
    val currentWeather = CurrentWeather(
        time = "2026-04-20T14:15",
        interval = 900,
        temperature = 13.0,
        windspeed = 14.8,
        winddirection = 267,
        is_day = 1,
        weathercode = 0
    )
    val dailyUnits = DailyUnits(
        time= "iso8601",
        temperature_2m_max = "°C",
        temperature_2m_min = "°C",
        weathercode = "wmo code",
        precipitation_sum = "mm"
    )
    return WeatherForecast(
        latitude = 67.28183,
        longitude = 14.385849,
        generationtime_ms = 0.16558170318603516,
        utc_offset_seconds = 7200,
        timezone = "Europe/Oslo",
        timezone_abbreviation = "GMT-2",
        elevation = 18.0,
        currentWeatherUnits,
        currentWeather,
        dailyUnits,
        dailyForecasts = dailyForecasts
    )
    }