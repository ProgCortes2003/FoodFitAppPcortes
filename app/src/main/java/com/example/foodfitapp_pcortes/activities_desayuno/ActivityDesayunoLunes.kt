package com.example.foodfitapp_pcortes.activities_desayuno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaManianaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityComidaManianaBinding
import com.example.foodfitapp_pcortes.databinding.ActivityDesayunoLunesBinding
import com.example.foodfitapp_pcortes.databinding.ActivityMainBinding

class ActivityDesayunoLunes : AppCompatActivity() {
    private lateinit var binding: ActivityDesayunoLunesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDesayunoLunesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVolverDesayunoLunes.setOnClickListener {
            finish()
            startActivity(Intent(this@ActivityDesayunoLunes,ComidaManianaActivity::class.java))
        }

    }
}