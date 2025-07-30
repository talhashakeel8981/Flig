package com.example.flightbooking.ui.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flightbooking.R

@Composable

fun airLineCard()
{

    Card(
        modifier = Modifier
            .padding(top = 580.dp)
            .padding(start = 15.dp, end = 15.dp)
            .fillMaxWidth()
            .height(250.dp),
        shape = RoundedCornerShape(25.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFDFFFF) // Light white-blue
            // or simply Color.White
        ),
        elevation = CardDefaults.cardElevation(50.dp)

    ) {

//        Row {
//            Image(
//
//                painter = painterResource(id = R.drawable.qatar),
//                contentDescription = "",
//                modifier = Modifier.size(100.dp)
//            )
//            Text(
//                text = buildAnnotatedString {
//                    withStyle(style = SpanStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color.Black)) {
//                        append("Qatar Airways")
//                    }
//                    append("\n")
//                    withStyle(style = SpanStyle(fontSize = 14.sp, fontWeight = FontWeight.Normal, color = Color.Gray)) {
//                        append("30 July 2025")
//                    }
//                }
//            )
//        }

        Column(


        ) {
            //header


            //divider
            //flight info
            
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

        ){

            Text(
                text = "Qatar Airways"
            )

            Text(
                text = "30 July 2025"
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
fun flightInfo(modifier: Modifier = Modifier) {
    Row (){
        //flight info (text)
        flightInfoText()
        //Image
        //flight info (text)
        flightInfoText()

    }
}

@Composable
fun flightInfoText() {
    Column (
        modifier = Modifier
            .padding(start = 5.dp, top = 5.dp)
    ){
        Text(
            text = "LON"
        )
        Spacer(modifier = Modifier
            .height(5.dp))
        Text(
            text = "London,GB"
        )
        Spacer(modifier = Modifier
            .height(5.dp))

        Text(
            text = "08:00 AM"
        )

    }
}

@Composable pre