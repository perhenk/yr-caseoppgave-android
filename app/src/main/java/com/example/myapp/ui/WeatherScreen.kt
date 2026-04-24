package com.example.myapp.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapp.data.viewmodels.UiState
import com.example.myapp.data.viewmodels.WeatherForecastViewModel
import com.example.myapp.ui.components.LoadingIcon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapp.data.models.toDayForecastList
import com.example.myapp.ui.components.CurrentWeatherSection
import com.example.myapp.ui.components.DailyForecastsList
import com.example.myapp.ui.components.DayForecastDetails
import com.example.myapp.ui.components.NetworkErrorMessage


@Composable
fun WeatherScreen( weatherForecastViewModel: WeatherForecastViewModel = viewModel()) {
        val navController = rememberNavController()

    Surface(modifier = Modifier.padding(0.dp,20.dp)) {

        val state by weatherForecastViewModel.uiState.collectAsStateWithLifecycle()
        when (val currentState =state) {
        is UiState.Error -> {
            NetworkErrorMessage({weatherForecastViewModel.fetchWeatherForecast()})
        }

        is UiState.Loading -> {
            LoadingIcon()
        }

        is UiState.Success -> {
            val dailyForecasts = currentState.weatherForecast.dailyForecasts.toDayForecastList()

            var selectedForecast = dailyForecasts[0]
            NavHost(navController = navController, startDestination = "list") {
                composable("list") {
                    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                        Text("PH's yr app", fontSize = 20.sp, modifier = Modifier.padding(20.dp).fillMaxWidth())
                        CurrentWeatherSection(currentState.weatherForecast.currentWeather)
                        DailyForecastsList(
                            dailyForecasts,
                            onItemClick = { forecast ->
                                selectedForecast = forecast
                                navController.navigate("details")
                            })
                    }
                }
                composable("details") {
                    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) { }
                    DayForecastDetails(navController = navController, selectedForecast)
                }
            }
        }
    }
    }

}