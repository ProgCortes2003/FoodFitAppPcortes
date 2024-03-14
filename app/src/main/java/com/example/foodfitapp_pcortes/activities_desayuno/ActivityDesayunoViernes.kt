package com.example.foodfitapp_pcortes.activities_desayuno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaManianaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityDesayunoJuevesBinding
import com.example.foodfitapp_pcortes.databinding.ActivityDesayunoViernesBinding

class ActivityDesayunoViernes : AppCompatActivity() {

    private lateinit var binding: ActivityDesayunoViernesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDesayunoViernesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDesayunoViernesVolver.setOnClickListener {
            startActivity(Intent(this@ActivityDesayunoViernes,ComidaManianaActivity::class.java))
        }
    }
}