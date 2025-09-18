package com.example.interfaz_pelicula

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.interfaz_pelicula.ui.theme.pantalla.MenuJumanjiSencillo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MenuJumanjiSencillo()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VistaPreviaMenuJumanjiSencillo() {
    MenuJumanjiSencillo()
}
