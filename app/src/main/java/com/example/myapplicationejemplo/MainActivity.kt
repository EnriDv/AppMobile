package com.example.myapplicationejemplo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplicationejemplo.ui.theme.MyApplicationEjemploTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //clase principal
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { //todo lo global
            MyApplicationEjemploTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Greeting(
                        name = "Enrique Diaz",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    )
    {
        Text(
            text = "Hola, $name!\nAplicaciones Moviles",
            modifier = modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyApplicationEjemploTheme {
        Greeting("Enrique Diaz")
    }
}
