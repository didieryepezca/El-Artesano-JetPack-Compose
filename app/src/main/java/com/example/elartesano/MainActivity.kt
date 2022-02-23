package com.example.elartesano

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.elartesano.navigation.AppNavigation
import com.example.elartesano.navigation.AppScreens
import com.example.elartesano.screens.AutenticarseArtesano
import com.example.elartesano.screens.MainScreen
import com.example.elartesano.screens.SplashScreen
import com.example.elartesano.ui.theme.ElArtesanoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ElArtesanoTheme {
                androidx.compose.material.Surface(color = MaterialTheme.colors.background){
                    AppNavigation()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ElArtesanoTheme {
        AppNavigation()
    }
}




