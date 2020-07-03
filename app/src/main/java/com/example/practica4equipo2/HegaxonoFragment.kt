package com.example.practica4equipo2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_hegaxono.*
import kotlin.math.sqrt

class HegaxonoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hegaxono, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.Bt_Resultado).setOnClickListener {
            if (Ed_Lado.text.isNullOrBlank()) {
                Toast.makeText(context, "Ingrese el valor", Toast.LENGTH_SHORT).show()
            } else {
                var Lado: Float = Ed_Lado.text.toString().toFloat()
                var Apotema: Float = sqrt((Lado * Lado) - ((Lado / 2) * (Lado / 2)))
                var Area: Float = ((6 * Lado) * Apotema) / 2
                Tv_Respuesta.text = Area.toString()
            }
        }
    }

}