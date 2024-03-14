package com.example.foodfitapp_pcortes.activities_cena

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaNocheActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityCenaJuevesBinding
import com.example.foodfitapp_pcortes.databinding.ActivityCenaSabadoBinding

class ActivityCenaSabado : AppCompatActivity() {
    private lateinit var binding: ActivityCenaSabadoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCenaSabadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCenaSabadoVolver.setOnClickListener {
            finish()
            startActivity(Intent(this@ActivityCenaSabado, ComidaNocheActivity::class.java))
        }
    }
}