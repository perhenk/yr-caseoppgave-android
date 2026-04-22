package com.example.myapp.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size

import androidx.compose.material3.Card

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapp.data.models.DayForecast
import com.example.myapp.utils.formatDate
import com.example.myapp.utils.weatherDescription
import org.intellij.lang.annotations.JdkConstants

@Composable
fun DayForecastDetails(navController: NavController, dayForecast: DayForecast) {

    val rowModifier = Modifier.fillMaxWidth()
    val rowHorizontalArrangement = Arrangement.SpaceBetween
    Column (modifier = Modifier.padding(10.dp)) {
        Row() {
            IconButton(onClick = ({ navController.popBackStack() })) {
                Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Tilbake")
            }
            Text(
                "${formatDate(dayForecast.time)}",
                fontSize = 25.sp,
                modifier = Modifier.padding(10.dp)
            )
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
            WeatherIcon(dayForecast.weatherCode, modifier = Modifier.size(100.dp))
            Text(weatherDescription(dayForecast.weatherCode), fontSize = 30.sp, modifier = Modifier.padding(20.dp))
        }

        Card(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
            Column(modifier = Modifier.padding(10.dp).fillMaxWidth()) {
                Row(modifier = rowModifier, rowHorizontalArrangement) {
                    Text("Høyeste temperatur")
                    Text("${dayForecast.maxTemperature}°")
                }
                Row(modifier = rowModifier, horizontalArrangement = rowHorizontalArrangement) {
                    Text("Laveste temperatur")
                    Text("${dayForecast.minTemperature}°")
                }
                Row(modifier = rowModifier, horizontalArrangement = rowHorizontalArrangement ){
                    Text("Nedbør")
                    Text("${dayForecast.precipitation} mm")
                }


            }
        }

}
}