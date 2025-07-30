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

@Composable

fun airLineCard()
{

    Card(
        modifier = Modifier
            .padding(top = 540.dp)
            .padding(12.dp)
            .fillMaxWidth()
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

            header()
            divider_flight()
            flightInfo()

        }
    }
}
@Composable
private  fun header()
{
    Row (

    ){
       //Image
        Image(

                painter = painterResource(id = R.drawable.qatar),
                contentDescription = "",
                modifier = Modifier.size(100.dp)
            )
        Column (
            modifier = Modifier
                .padding(top = 30.dp)
        ){

            Text(
                text = "Qatar Airways",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold

            )
Spacer(modifier = Modifier
    .height(5.dp))
            Text(
                text = "30 November 2025",
                fontSize = 15.sp,
                color = Color(red = 175, green = 177, blue = 178)
            )

        }
    }
}

@Composable
private fun divider_flight() {
    Row (
        
    ){  
        
        //first semi circle
        //dash lines (use canvas)
        //second semi circle
    }
}

@Composable
fun flightInfo() {
    Row (){
        //flight info (text)
        flightInfoText()
        //Image
        //flight info (text)
//        flightInfoText()

    }
}

@Composable
fun flightInfoText() {
    Row( // 👈 wrapped all columns inside a Row
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(), // 👈 make row take full width
        horizontalArrangement = Arrangement.SpaceEvenly, // 👈 equal spacing between columns
        verticalAlignment = Alignment.CenterVertically // 👈 vertically center the icon with text
    ) {
        // Departure Column
        Column(
            modifier = Modifier
                .padding(start = 5.dp, top = 5.dp)
        ) {
            Text(
                text = "LON",
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "London,GB",
                color = Color(red = 175, green = 177, blue = 178)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "08:00 AM",
                color = Color(red = 175, green = 177, blue = 178)
            )
        }

        // Plane Icon Column
        Column {
            Icon(
                painter = painterResource(id = R.drawable.plane),
                contentDescription = "",
                modifier = Modifier.size(30.dp),
                tint = Color.Black

            )
        }

        // Arrival Column
        Column {
            Text(
                text = "POR",
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "Lisbon,Portugal",
                color = Color(red = 175, green = 177, blue = 178)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "12:00 AM",
                color = Color(red = 175, green = 177, blue = 178)
            )
        }
    }
}

@Preview
@Composable
fun airline()
{
    airLineCard()

}