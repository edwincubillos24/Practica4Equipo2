package com.example.practica4equipo2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_perimetro__circulo.*


class Perimetro_CirculoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perimetro__circulo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_calcular.setOnClickListener {
            //Accion para calcular
            val radio = et_radio.text.toString().toDouble()
            val PI = 3.141516
            val perimetro = 2 * PI * radio
            tv_resultado.text = "El perimetro es: " + perimetro.toString()
        }


    }
}