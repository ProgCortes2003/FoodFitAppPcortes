package com.example.foodfitapp_pcortes.activities_cena

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaNocheActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityCenaJuevesBinding

class ActivityCenaJueves : AppCompatActivity() {

    private lateinit var binding: ActivityCenaJuevesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCenaJuevesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCenaJuevesVolver.setOnClickListener {
            finish()
            startActivity(Intent(this@ActivityCenaJueves, ComidaNocheActivity::class.java))
        }
    }
}