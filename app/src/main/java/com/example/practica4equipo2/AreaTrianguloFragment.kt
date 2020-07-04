package com.example.practica4equipo2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_area_triangulo.*

class AreaTrianguloFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_area_triangulo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        view.findViewById<Button>(R.id.BT_calcular).setOnClickListener
        BT_calcular.setOnClickListener {
            val base = ET_base.text.toString()
            val altura = ET_altura.text.toString()
            if (base.isEmpty() or altura.isEmpty()) {
                Toast.makeText(context, "Por favor llene los espacios", Toast.LENGTH_SHORT).show()
            } else {
                val base1 = base.toDouble()
                val altura1 = altura.toDouble()
                TV_resultado.text = ((base1 * altura1) / 2).toString()
            }

        }

    }
}