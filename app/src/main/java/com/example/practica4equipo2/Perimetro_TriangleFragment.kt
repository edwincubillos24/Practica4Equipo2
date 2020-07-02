package com.example.practica4equipo2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_perimetro__triangle.*


class Perimetro_TriangleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_perimetro__triangle, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bt_ptriangle.setOnClickListener {
            val ladoa = etn_ladoa.text.toString()
            val ladob = etn_ladob.text.toString()
            val ladoc = etn_ladoc.text.toString()

            val resultado = ladoa.toDouble() + ladob.toDouble() + ladoc.toDouble()

            tv_resultadoptriangle.text = resultado.toString()
        }
    }

}