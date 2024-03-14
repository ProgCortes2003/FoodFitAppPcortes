package com.example.foodfitapp_pcortes.activities_almuerzo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaMediodiaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityAlmuerzoSabadoBinding

class ActivityAlmuerzoSabado : AppCompatActivity() {
    private lateinit var binding: ActivityAlmuerzoSabadoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlmuerzoSabadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlmuerzoSabadoVolver.setOnClickListener {
            startActivity(Intent(this@ActivityAlmuerzoSabado, ComidaMediodiaActivity::class.java))
        }
    }
}