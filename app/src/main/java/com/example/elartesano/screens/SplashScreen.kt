package com.example.elartesano.screens

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController
import com.example.elartesano.R

import com.example.elartesano.navigation.AppScreens
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController){

    val escala = remember{ androidx.compose.animation.core.Animatable(0f) }
    
    LaunchedEffect(key1 = true){

        escala.animateTo(
            targetValue = 1.0f,
            animationSpec = tween(
                durationMillis = 800,
                easing = {
                    OvershootInterpolator(6f).getInterpolation(it)
                }
            )
        )
        
        delay(2000)
        navController.navigate(AppScreens.MainScreen.route){
            popUpTo(AppScreens.SplashScreen.route){
                inclusive = true
            } //Si presionamos el boton para atras
        }
    }

    Column(modifier = androidx.compose.ui.Modifier
        .fillMaxSize()
        .background(color = colorResource(id = R.color.artesanoYellow)), //accedemos a res/values/colors.xml
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
    )
    {
        Image(
            painterResource(R.drawable.artesano_logo),
            "Logo Artesano",
            modifier = androidx.compose.ui.Modifier
                .width(750.dp)
                .height(750.dp)
                .scale(escala.value)
        )
    }
}