package com.example.myapp.utils

fun weatherDescription(code: Int): String = when (code) {
    0            -> "Klarvær"
    1            -> "Stort sett klart"
    2            -> "Delvis skyet"
    3            -> "Overskyet"
    in 45..48    -> "Tåke"
    in 51..55    -> "Yr"
    in 61..65    -> "Regn"
    in 71..75    -> "Snø"
    in 80..82    -> "Regnbyger"
    in 85..86    -> "Snøbyger"
    in 95..99    -> "Tordenvær"
    else         -> "Ukjent"
}
