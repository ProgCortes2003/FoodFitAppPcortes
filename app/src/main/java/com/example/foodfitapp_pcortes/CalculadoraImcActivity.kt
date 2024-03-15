package com.example.foodfitapp_pcortes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.foodfitapp_pcortes.databinding.ActivityCalculadoraImcBinding

class CalculadoraImcActivity : AppCompatActivity() {

    lateinit var binding: ActivityCalculadoraImcBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculadoraImcBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnImcVolver.setOnClickListener {
            finish()
            startActivity(Intent(this@CalculadoraImcActivity, MainActivity::class.java))
        }

        binding.btnCalcularImc.setOnClickListener {

            val altura = binding.datoAlturaEditText.text.toString().toDouble()
            val peso = binding.datoPesoEditText.text.toString().toDouble()

            if(altura > 0.0 && peso > 0.0){
                val imc = calcularIMC(altura,peso)
                binding.resultadoCalculadoraImc.text = "Tú índice de masa corporal es ${String.format("%0.2f", imc)} perteneces a la categoría de ${determinarResultadoIMC(imc)}"
            }else{
                Toast.makeText(this,"Por favor ingresa valores válidos de peso y altura",Toast.LENGTH_LONG).show()
            }
        }

        binding.btnBorrarEditText.setOnClickListener {
            binding.datoAlturaEditText.text.clear()
            binding.datoPesoEditText.text.clear()
            binding.resultadoCalculadoraImc.text = "Aquí se mostrará tu resultado."
        }
    }

    private fun calcularIMC(altura:Double, peso:Double):Double{
        val imc = peso / (altura*altura)
        return imc
    }

    private fun determinarResultadoIMC(imc:Double):String{
        return when{
            imc < 16.0 -> "Delgadez Severa"
            imc <= 16.99 -> "Delgadez Moderada"
            imc <= 18.49 -> "Delgadez Aceptable"
            imc <= 24.99 -> "Peso Normal"
            imc <= 29.99 -> "Sobrepeso"
            imc <= 34.99 -> "Obesidad tipo I"
            imc <= 40.0 -> "Obesidad tipo II"
            else -> "Obesidad tipo III"
        }
    }

}