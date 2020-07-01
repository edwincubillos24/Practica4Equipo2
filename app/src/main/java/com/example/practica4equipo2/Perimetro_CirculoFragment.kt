package com.example.practica4equipo2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_perimetro__circulo.*


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


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


        bt_next.setOnClickListener {
            //Batman llama a superman
            // findNavController().navigate(R.id.action_BatmanFragment_to_flashFragment)
        }

    }
}