package com.example.flightbooking.ui.Screen

import com.example.flightbooking.R

data class AirlineData (

    val airlineName: String,
    val date: String,
    val departureCode: String,
    val departureCity: String,
    val departureTime: String,
    val arrivalCode: String,
    val arrivalCity: String,
    val arrivalTime: String,
    val airlineLogoResId: Int // image resource like R.drawable.qatar

)

// ✅ Your sample flight list
val flightList = listOf(
    AirlineData("Qatar Airways", "30 November 2025", "LON", "London, GB", "08:00 AM", "POR", "Lisbon, Portugal", "12:00 AM", R.drawable.qatar),
    AirlineData("Emirates", "01 December 2025", "DXB", "Dubai, UAE", "10:00 AM", "JFK", "New York, USA", "05:00 PM", R.drawable.qatar),
    AirlineData("PIA", "02 December 2025", "ISB", "Islamabad", "07:00 AM", "LHE", "Lahore", "08:30 AM", R.drawable.qatar)
)