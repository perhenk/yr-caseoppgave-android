package com.example.myapp.utils

import org.junit.Test
import org.junit.Assert.assertEquals

class FormatDateTest {
    @Test
    fun formatDate_returnsDayAndNorwegianMonth_whenDateIsValid() {
        val result = formatDate("2025-04-22")
        assertEquals("22 apr", result)
    }
}