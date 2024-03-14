package com.example.foodfitapp_pcortes.activities_cena

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaNocheActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityCenaLunesBinding

class ActivityCenaLunes : AppCompatActivity() {

    private lateinit var binding: ActivityCenaLunesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCenaLunesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCenaLunesVolver.setOnClickListener {
            finish()
            startActivity(Intent(this@ActivityCenaLunes, ComidaNocheActivity::class.java))
        }
    }
}