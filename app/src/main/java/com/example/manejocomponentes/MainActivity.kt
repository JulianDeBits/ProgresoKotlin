package com.example.manejocomponentes

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.res.colorResource

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

        if (Componente.text == "Te amo Princesa"){

            Componente.text = "Muestre el inicio"

        } else {

            Componente.text = "Te amo Princesa"
        }

    }

    fun CambiarPantalla(){


    }
}
