package com.example.practica4equipo2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_perimetro__circulo.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_calcular.setOnClickListener {
            //Accion para calcular
            val radio = et_radio.text.toString().toDouble()
            val PI = 3.141516
            val perimetro = 2 * PI * radio
            tv_resultado.text = "El perimetro es: " + perimetro.toString()
        }
    }

}