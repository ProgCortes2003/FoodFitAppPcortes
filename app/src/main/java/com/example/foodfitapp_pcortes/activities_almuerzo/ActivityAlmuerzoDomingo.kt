package com.example.foodfitapp_pcortes.activities_almuerzo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaMediodiaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityAlmuerzoDomingoBinding

class ActivityAlmuerzoDomingo : AppCompatActivity() {
    private lateinit var binding: ActivityAlmuerzoDomingoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlmuerzoDomingoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlmuerzoDomingoVolver.setOnClickListener {
            startActivity(Intent(this@ActivityAlmuerzoDomingo, ComidaMediodiaActivity::class.java))
        }
    }
}