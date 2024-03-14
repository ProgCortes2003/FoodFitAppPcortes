package com.example.foodfitapp_pcortes.activities_almuerzo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaMediodiaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityAlmuerzoLunesBinding

class ActivityAlmuerzoLunes : AppCompatActivity() {

    private lateinit var binding: ActivityAlmuerzoLunesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlmuerzoLunesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlmuerzoLunesVolver.setOnClickListener {
            finish()
            startActivity(Intent(this@ActivityAlmuerzoLunes, ComidaMediodiaActivity::class.java))
        }
    }
}