package com.example.myapp.data.viewmodels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.example.myapp.data.models.WeatherForecast
import com.example.myapp.data.repositories.WeatherRepository
import kotlinx.coroutines.launch


sealed class UiState{
    object Loadning: UiState()
    data class Success(val weatherForecast: WeatherForecast): UiState()
    data class Error(val message: String): UiState()
}
class WeatherForecastViewModel : ViewModel() {
    private val repository = WeatherRepository()

    private var internalState: MutableState<UiState> = mutableStateOf(UiState.Loadning)
    val state = internalState


    private fun fetchWeatherForecast()
    {
        viewModelScope.launch {
            internalState.value = UiState.Loadning
            try {
                val weatherForecast = repository.getWeatherForecast()
                internalState.value = UiState.Success(weatherForecast)
            }catch (e: Exception){
                e.printStackTrace()
                internalState.value = UiState.Error("Kunne ikke hente data fra API")
            }
        }
    }

    init {
        fetchWeatherForecast()
    }
}
