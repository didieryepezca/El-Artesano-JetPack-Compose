package com.example.elartesano.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

import com.example.elartesano.R
import com.example.elartesano.navigation.AppScreens
import com.example.elartesano.ui.theme.Sansita


@Composable
fun MainScreen(navController: NavController){

    Box(modifier = androidx.compose.ui.Modifier
        .fillMaxSize()
        .background(Color.White)
    ){
        Text(text = "El Artesano te da la Bienvenida",
             style = TextStyle(Color.Black,
                                fontSize = 45.sp,
                                fontWeight = FontWeight.Bold
                                ),
            fontFamily = FontFamily(Font(R.font.sansita_bold)),
            //fontFamily = Sansita, fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 140.dp, start = 55.dp, end = 55.dp))

        //Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Por favor, autentícate para continuar",
            style = TextStyle(Color.Black,
                fontSize = 22.sp
            ),
            fontFamily = FontFamily(Font(R.font.sansita_regular)),
            //fontFamily = Sansita, fontWeight = FontWeight.Normal,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 360.dp, start = 5.dp, end = 5.dp))


        Button(onClick = {
            navController.navigate(route = AppScreens.AuthArtesano.route)
        }, modifier = Modifier.align(Alignment.TopCenter)
                              .padding(top = 395.dp, start = 5.dp, end = 5.dp)
                                .size(width = 330.dp,height = 35.dp)
        ) {
            Text(text = "SOY EL ARTESANO",
                style = TextStyle(Color.Black)
            )
        }

        Button(onClick = {
            navController.navigate(route = AppScreens.AuthCliente.route)
        }, modifier = Modifier.align(Alignment.TopCenter)
            .padding(top = 445.dp, start = 5.dp, end = 5.dp)
            .size(width = 330.dp,height = 35.dp)
        ) {
            Text(text = "SOY UN CLIENTE",
                style = TextStyle(Color.Black)
            )
        }

    }
}

