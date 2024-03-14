package com.example.foodfitapp_pcortes.activities_desayuno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaManianaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityDesayunoJuevesBinding
import com.example.foodfitapp_pcortes.databinding.ActivityDesayunoMiercolesBinding

class ActivityDesayunoJueves : AppCompatActivity() {

    private lateinit var binding: ActivityDesayunoJuevesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDesayunoJuevesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDesayunoJuevesVolver.setOnClickListener {
            finish()
            startActivity(Intent(this@ActivityDesayunoJueves, ComidaManianaActivity::class.java))
        }
    }
}