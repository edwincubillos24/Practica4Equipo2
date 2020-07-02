package com.example.practica4equipo2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_perimetro_cuadro.*


class Perimetro_cuadroFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perimetro_cuadro, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        bt_calcularpc.setOnClickListener {
            val numladopc = et_numladosc.text.toString()
            val perimetrocuadro = (4 * numladopc.toDouble())

            if (et_numladosc.text.isEmpty()) {
                tv_resultadopc.text = "Complete el campo"
            } else {
                tv_resultadopc.text = "El perimetro del cuadrado es: $perimetrocuadro"
            }

        }
    }
}








