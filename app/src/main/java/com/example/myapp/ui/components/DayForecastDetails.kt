package com.example.myapp.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DayForecastDetails(navController: NavController) {
    Row(modifier = Modifier.padding(10.dp)) {
                Text("<- Hello details", modifier = Modifier
                    .padding(10.dp)
                    .clickable(onClick = ({navController.popBackStack()})))
    }
}