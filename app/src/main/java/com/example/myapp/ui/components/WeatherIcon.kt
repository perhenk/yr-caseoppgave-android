package com.example.myapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.myapp.R

@Composable
fun WeatherIcon(wmoCode: Int, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = wmoToDrawable(wmoCode)),
        contentDescription = null,
        modifier = modifier
    )
}

fun wmoToDrawable(code: Int): Int = when (code) {
    0        -> R.drawable.light_01d
    1        -> R.drawable.light_02d
    2        -> R.drawable.light_03d
    3        -> R.drawable.light_04
    in 45..48 -> R.drawable.light_15
    51, 53   -> R.drawable.light_46
    55       -> R.drawable.light_09
    61       -> R.drawable.light_46
    63       -> R.drawable.light_09
    65       -> R.drawable.light_10
    71       -> R.drawable.light_49
    73       -> R.drawable.light_13
    75, 77   -> R.drawable.light_50
    80       -> R.drawable.light_40d
    81       -> R.drawable.light_05d
    82       -> R.drawable.light_41d
    85       -> R.drawable.light_44d
    86       -> R.drawable.light_08d
    95       -> R.drawable.light_22
    96       -> R.drawable.light_06d
    99       -> R.drawable.light_25d
    else     -> R.drawable.light_04
}
