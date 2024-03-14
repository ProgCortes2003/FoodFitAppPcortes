package com.example.foodfitapp_pcortes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.databinding.ActivityComidaManianaBinding
import com.example.foodfitapp_pcortes.databinding.ActivityComidaMediodiaBinding

class ComidaMediodiaActivity : AppCompatActivity() {

    lateinit var binding: ActivityComidaMediodiaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComidaMediodiaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlmuerzoVolver.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaMediodiaActivity,MainActivity::class.java))
        }
    }
}