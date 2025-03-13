package com.example.manejocomponentes

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.manejocomponentes.ui.theme.ManejoComponentesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.testlayout)

        var testbtn: Button = findViewById(R.id.selectedbtn)
        var testtxt: TextView = findViewById(R.id.selectedtxt)

        testbtn.setOnClickListener {
            CambiarTexto(testtxt)
        }

    }

    fun CambiarTexto (Componente: TextView){

        if (Componente.text == "Ahora la Opcion 2"){

            Componente.text = "Mostrando Opcion 1"

        } else {

            Componente.text = "Ahora la Opcion 2"
        }

    }
}
