package com.example.foodfitapp_pcortes.activities_cena

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaNocheActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityCenaMartesBinding

class ActivityCenaMartes : AppCompatActivity() {

    private lateinit var binding:ActivityCenaMartesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCenaMartesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCenaMartesVolver.setOnClickListener {
            startActivity(Intent(this@ActivityCenaMartes, ComidaNocheActivity::class.java))
        }
    }
}