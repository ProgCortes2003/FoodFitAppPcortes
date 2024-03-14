package com.example.foodfitapp_pcortes.activities_desayuno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaManianaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityDesayunoSabadoBinding

class ActivityDesayunoSabado : AppCompatActivity() {

    private lateinit var binding:ActivityDesayunoSabadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDesayunoSabadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDesayunoSabadoVolver.setOnClickListener {
            finish()
            startActivity(Intent(this@ActivityDesayunoSabado, ComidaManianaActivity::class.java))
        }
    }
}