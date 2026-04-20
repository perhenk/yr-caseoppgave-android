package com.example.myapp.utils

fun formatDate(dateStr: String): String {
    val parts = dateStr.split("-")
    if (parts.size != 3) return dateStr
    val months = arrayOf("jan","feb","mar","apr","mai","jun","jul","aug","sep","okt","nov","des")
    val monthIndex = (parts[1].toIntOrNull() ?: 1) - 1
    return "${parts[2]} ${months.getOrElse(monthIndex) { "" }}"
}
