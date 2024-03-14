package com.example.foodfitapp_pcortes.activities_almuerzo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaMediodiaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityAlmuerzoJuevesBinding
import com.example.foodfitapp_pcortes.databinding.ActivityComidaNocheBinding

class ActivityAlmuerzoJueves : AppCompatActivity() {

    private lateinit var binding: ActivityAlmuerzoJuevesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlmuerzoJuevesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlmuerzoJuevesVolver.setOnClickListener{
            startActivity(Intent(this@ActivityAlmuerzoJueves, ComidaMediodiaActivity::class.java))
        }
    }
}