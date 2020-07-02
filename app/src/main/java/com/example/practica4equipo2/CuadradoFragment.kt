package com.example.practica4equipo2
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_cuadrado.*
class CuadradoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cuadrado, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("ole", "sdgdfgdf")
        view.findViewById<Button>(R.id.bt_resultado).setOnClickListener {
            Log.d("ole", "sdgdfgdf")
            if(et_lado.text.isNullOrEmpty()) {
                Toast.makeText(context, "Ingrese un valor", Toast.LENGTH_SHORT).show()
            }else {
                var lado = et_lado.text.toString().toFloat()
                tv_respuesta.text = (lado * lado).toString()
                Log.d("ole", "$lado")
            }
        }
    }
}