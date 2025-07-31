package com.example.flightbooking.ui.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flightbooking.R
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size

import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items


@Composable
fun FlightListLazyRow() {
    LazyRow(
        modifier = Modifier
            .padding(top = 16.dp) // same as your original card
    ) {
        items(flightList) { flight ->
            airLineCard(flight)
        }
    }
}

@Composable

fun airLineCard(flight: AirlineData)
{

    Card(
        modifier = Modifier
            .padding(top = 540.dp)
            .padding(12.dp)
            .width(350.dp) // ✅ fixed
            .height(210.dp),
        shape = RoundedCornerShape(25.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFDFFFF) // Light white-blue
            // or simply Color.White
        ),
        elevation = CardDefaults.cardElevation(50.dp)

    ) {


        Column(


        ) {

            header(flight)
            divider_flight()
            flightInfo(flight)

        }
    }
}



@Composable
private  fun header(flight:AirlineData)
{
    Row(
        modifier = Modifier.padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = flight.airlineLogoResId),
            contentDescription = flight.airlineName,
            modifier = Modifier.size(80.dp)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(
                text = flight.airlineName,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = flight.date,
                fontSize = 14.sp,
                color = Color(175, 177, 178)
            )
        }
    }
}

@Composable
fun divider_flight(
    dashWidth: Float = 15f,
    gapWidth: Float = 15f,
    color: Color = Color.Gray,
    strokeWidth: Float = 1f
) {
    // Canvas is placed inside a Row so it spans full width
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(strokeWidth.dp)
        ) {
            val totalWidth = size.width
            var startX = 0f

            // Draw dashes repeatedly until the total width is covered
            while (startX < totalWidth) {
                drawLine(
                    color = color,
                    start = Offset(x = startX, y = 0f),
                    end = Offset(x = startX + dashWidth, y = 0f),
                    strokeWidth = strokeWidth
                )
                startX += dashWidth + gapWidth
            }
        }
    }
}


@Composable
fun flightInfo(flight: AirlineData) {
    Row(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Departure Column
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = flight.departureCode, fontWeight = FontWeight.Bold, fontSize = 25.sp)
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = flight.departureCity, color = Color(175, 177, 178))
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = flight.departureTime, color = Color(175, 177, 178))
        }

        // Plane Icon Column
        Column {
            Icon(
                painter = painterResource(id = R.drawable.plane),
                contentDescription = "Flight",
                modifier = Modifier.size(30.dp),
                tint = Color.Gray
            )
        }

        // Arrival Column
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = flight.arrivalCode, fontWeight = FontWeight.Bold, fontSize = 25.sp)
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = flight.arrivalCity, color = Color(175, 177, 178))
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = flight.arrivalTime, color = Color(175, 177, 178))
        }
    }
}

//@Composable
//fun flightInfoText() {
//    Row( // 👈 wrapped all columns inside a Row
//        modifier = Modifier
//            .padding(16.dp)
//            .fillMaxWidth(), // 👈 make row take full width
//        horizontalArrangement = Arrangement.SpaceEvenly, // 👈 equal spacing between columns
//        verticalAlignment = Alignment.CenterVertically // 👈 vertically center the icon with text
//    ) {
//        // Departure Column
//        Column(
//            modifier = Modifier
//                .padding(start = 5.dp, top = 5.dp)
//        ) {
//            Text(
//                text = "LON",
//                fontWeight = FontWeight.Bold,
//                fontSize = 25.sp
//            )
//            Spacer(modifier = Modifier.height(5.dp))
//            Text(
//                text = "London,GB",
//                color = Color(red = 175, green = 177, blue = 178)
//            )
//            Spacer(modifier = Modifier.height(5.dp))
//            Text(
//                text = "08:00 AM",
//                color = Color(red = 175, green = 177, blue = 178)
//            )
//        }
//
//        // Plane Icon Column
//        Column {
//            Icon(
//                painter = painterResource(id = R.drawable.plane),
//                contentDescription = "",
//                modifier = Modifier.size(30.dp),
//                tint = Color.Gray
//
//            )
//        }
//
//        // Arrival Column
//        Column {
//            Text(
//                text = "POR",
//                fontWeight = FontWeight.Bold,
//                fontSize = 25.sp
//            )
//            Spacer(modifier = Modifier.height(5.dp))
//            Text(
//                text = "Lisbon,Portugal",
//                color = Color(red = 175, green = 177, blue = 178)
//            )
//            Spacer(modifier = Modifier.height(5.dp))
//            Text(
//                text = "12:00 AM",
//                color = Color(red = 175, green = 177, blue = 178)
//            )
//        }
//    }
//}

//@Composable
//fun flightInfoText(flight: AirlineData) {
//    Row(
//        modifier = Modifier
//            .padding(16.dp)
//            .fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceEvenly,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        Column {
//            Text(text = flight.departureCode, fontWeight = FontWeight.Bold, fontSize = 25.sp)
//            Spacer(modifier = Modifier.height(5.dp))
//            Text(text = flight.departureCity, color = Color(175, 177, 178))
//            Spacer(modifier = Modifier.height(5.dp))
//            Text(text = flight.departureTime, color = Color(175, 177, 178))
//        }
//
//        Column {
//            Icon(
//                painter = painterResource(id = R.drawable.plane),
//                contentDescription = null,
//                modifier = Modifier.size(30.dp),
//                tint = Color.Gray
//            )
//        }
//
//        Column {
//            Text(text = flight.arrivalCode, fontWeight = FontWeight.Bold, fontSize = 25.sp)
//            Spacer(modifier = Modifier.height(5.dp))
//            Text(text = flight.arrivalCity, color = Color(175, 177, 178))
//            Spacer(modifier = Modifier.height(5.dp))
//            Text(text = flight.arrivalTime, color = Color(175, 177, 178))
//        }
//    }
//}
//




@Preview
@Composable
fun airline()
{
    FlightListLazyRow()
//    airLineCard(flight = AirlineData())

}