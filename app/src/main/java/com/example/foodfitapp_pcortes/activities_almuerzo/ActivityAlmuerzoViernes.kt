package com.example.foodfitapp_pcortes.activities_almuerzo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaMediodiaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityAlmuerzoViernesBinding

class ActivityAlmuerzoViernes : AppCompatActivity() {
    private lateinit var binding: ActivityAlmuerzoViernesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlmuerzoViernesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlmuerzoViernesVolver.setOnClickListener {
            startActivity(Intent(this@ActivityAlmuerzoViernes,ComidaMediodiaActivity::class.java))
        }
    }
}