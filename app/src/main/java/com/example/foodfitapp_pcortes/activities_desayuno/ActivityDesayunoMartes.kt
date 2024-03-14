package com.example.foodfitapp_pcortes.activities_desayuno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaManianaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityDesayunoLunesBinding
import com.example.foodfitapp_pcortes.databinding.ActivityDesayunoMartesBinding

class ActivityDesayunoMartes : AppCompatActivity() {
    private lateinit var binding: ActivityDesayunoMartesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDesayunoMartesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDesayunoMartesVolver.setOnClickListener {
            finish()
            startActivity(Intent(this@ActivityDesayunoMartes, ComidaManianaActivity::class.java))
        }
    }
}