package com.example.practica4equipo2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_area_circulo.*

class AreaCirculoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_area_circulo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val pi = 3.1415926
        var area: Double
        var valor: String
        bt_area_circulo_calcular.setOnClickListener {
            if (et_area_circulo_radio.text.isNullOrEmpty()) {
                tv_area_circulo.text = "ingrese un radio"
            } else {
                valor = et_area_circulo_radio.text.toString()
                area = valor.toDouble()
                area *= pi * area
                valor = area.toString()
                tv_area_circulo.text = valor
            }
        }
    }

}