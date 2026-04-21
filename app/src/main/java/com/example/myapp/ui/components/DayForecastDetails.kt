package com.example.myapp.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapp.data.models.DayForecast
import com.example.myapp.utils.formatDate
import com.example.myapp.utils.weatherDescription

@Composable
fun DayForecastDetails(navController: NavController, dayForecast: DayForecast) {
    Column (modifier = Modifier.padding(10.dp)) {
            Text("<- ${formatDate(dayForecast.time)}", modifier = Modifier
                .padding(10.dp)
                .clickable(onClick = ({navController.popBackStack()})))

        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
            WeatherIcon(dayForecast.weatherCode)
            Text(weatherDescription(dayForecast.weatherCode), fontSize = 30.sp)
        }

        Card(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
            Column(modifier = Modifier.padding(10.dp)) {
                Text("Høyeste temperatur ${dayForecast.maxTemperature}°")
                Text("Laveste temperatur ${dayForecast.minTemperature}°")
                Text("Nedbør ${dayForecast.precipitation} mm")
            }
        }

}
}