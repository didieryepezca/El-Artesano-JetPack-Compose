package com.example.elartesano.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.elartesano.screens.*

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.SplashScreen.route){
        composable(route = AppScreens.SplashScreen.route){
            SplashScreen(navController = navController)
        }
        composable(route = AppScreens.MainScreen.route){
            MainScreen(navController)
        }
        composable(route = AppScreens.AuthArtesano.route){
            AutenticarseArtesano(navController)
        }
        composable(route = AppScreens.AuthCliente.route){
            AutenticarseCliente(navController)
        }
        composable(route = AppScreens.UsuarioSendMailRecovery.route){
            UsuarioSendMailRecoveryContrase├▒a(navController)
        }
    }

}