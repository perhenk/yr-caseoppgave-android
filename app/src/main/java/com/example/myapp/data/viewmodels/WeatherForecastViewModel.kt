package com.example.myapp.data.viewmodels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.example.myapp.data.models.WeatherForecast
import com.example.myapp.data.repositories.WeatherRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


sealed class UiState{
    object Loading: UiState()
    data class Success(val weatherForecast: WeatherForecast): UiState()
    data class Error(val message: String): UiState()
}
class WeatherForecastViewModel : ViewModel() {
    private val repository = WeatherRepository()

    private var _uiState: MutableStateFlow<UiState> = MutableStateFlow<UiState>(UiState.Loading)
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    fun fetchWeatherForecast()
    {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            try {
                val weatherForecast = repository.getWeatherForecast()
                _uiState.value = UiState.Success(weatherForecast)
            }catch (e: Exception){
                e.printStackTrace()
                _uiState.value = UiState.Error("Kunne ikke hente data fra API")
            }
        }
    }

    init {
        fetchWeatherForecast()
    }
}
