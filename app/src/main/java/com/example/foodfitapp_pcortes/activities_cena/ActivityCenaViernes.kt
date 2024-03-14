package com.example.foodfitapp_pcortes.activities_cena

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaNocheActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityCenaJuevesBinding
import com.example.foodfitapp_pcortes.databinding.ActivityCenaViernesBinding

class ActivityCenaViernes : AppCompatActivity() {

        private lateinit var binding: ActivityCenaViernesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCenaViernesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCenaViernesVolver.setOnClickListener {
            finish()
            startActivity(Intent(this@ActivityCenaViernes, ComidaNocheActivity::class.java))
        }
    }
}