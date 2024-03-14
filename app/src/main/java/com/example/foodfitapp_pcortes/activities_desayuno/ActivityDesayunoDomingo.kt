package com.example.foodfitapp_pcortes.activities_desayuno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaManianaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityDesayunoDomingoBinding

class ActivityDesayunoDomingo : AppCompatActivity() {

    private lateinit var binding: ActivityDesayunoDomingoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDesayunoDomingoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDesayunoDomingoVolver.setOnClickListener {
            finish()
            startActivity(Intent(this@ActivityDesayunoDomingo,ComidaManianaActivity::class.java))
        }
    }
}