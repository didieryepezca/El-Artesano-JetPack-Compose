package com.example.elartesano.navigation

sealed class AppScreens(val route: String){

    object SplashScreen: AppScreens("splash_screen")
    object MainScreen: AppScreens("main_screen")
    object AuthArtesano: AppScreens("auth_artesano")
    object AuthCliente: AppScreens("auth_cliente")
    object UsuarioSendMailRecovery: AppScreens("usuario_password_recovery")


}
