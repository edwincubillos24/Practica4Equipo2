package com.example.practica4equipo2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_navegation.*


class NavegationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_navegation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_areacirculo.setOnClickListener {
            findNavController().navigate(R.id.action_navegationFragment_to_areaCirculoFragment)
        }
        bt_perimetrocirculo.setOnClickListener {
            findNavController().navigate(R.id.action_navegationFragment_to_perimetro_CirculoFragment)
        }
        bt_areatriangulo.setOnClickListener {
            findNavController().navigate(R.id.action_navegationFragment_to_areaTrianguloFragment)
        }
        bt_perimetrotriangulo.setOnClickListener {
            findNavController().navigate(R.id.action_navegationFragment_to_perimetro_TriangleFragment)
        }
        bt_areacuadrado.setOnClickListener {
            findNavController().navigate(R.id.action_navegationFragment_to_cuadradoFragment)
        }
        bt_perimetrocuadrado.setOnClickListener {
            findNavController().navigate(R.id.action_navegationFragment_to_perimetro_cuadroFragment)
        }
        bt_areahexagono.setOnClickListener {
            findNavController().navigate(R.id.action_navegationFragment_to_hegaxonoFragment)
        }
        bt_perimetrohexagono.setOnClickListener {
            findNavController().navigate(R.id.action_navegationFragment_to_fragment_perimetro_hexagono)
        }

    }

}