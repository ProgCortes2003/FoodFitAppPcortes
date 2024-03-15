package com.example.foodfitapp_pcortes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        valuesInital()

    }

    private fun valuesInital(){

        binding.cardComidaManiana.setOnClickListener{
            startActivity(Intent(this@MainActivity,ComidaManianaActivity::class.java))
        }
        binding.cardComidaMediodia.setOnClickListener {
            startActivity(Intent(this@MainActivity,ComidaMediodiaActivity::class.java))
        }
        binding.cardComidaNoche.setOnClickListener {
            startActivity(Intent(this@MainActivity,ComidaNocheActivity::class.java))
        }
        binding.cardCalculadoraIMC.setOnClickListener {
            startActivity(Intent(this@MainActivity,CalculadoraImcActivity::class.java))
        }
        }


}