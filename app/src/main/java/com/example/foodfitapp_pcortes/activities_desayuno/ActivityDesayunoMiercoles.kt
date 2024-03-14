package com.example.foodfitapp_pcortes.activities_desayuno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaManianaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityDesayunoMiercolesBinding
import com.example.foodfitapp_pcortes.databinding.ActivityMainBinding

class ActivityDesayunoMiercoles : AppCompatActivity() {

    private lateinit var binding: ActivityDesayunoMiercolesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDesayunoMiercolesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDesayunoMiercolesVolver.setOnClickListener {
            finish()
            startActivity(Intent(this@ActivityDesayunoMiercoles,ComidaManianaActivity::class.java))
        }
    }
}