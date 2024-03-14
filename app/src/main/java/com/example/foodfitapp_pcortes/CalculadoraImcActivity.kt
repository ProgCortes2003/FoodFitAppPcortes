package com.example.foodfitapp_pcortes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }
}