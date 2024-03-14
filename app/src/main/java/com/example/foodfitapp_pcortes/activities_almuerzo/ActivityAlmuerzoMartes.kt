package com.example.foodfitapp_pcortes.activities_almuerzo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaMediodiaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityAlmuerzoMartesBinding

class ActivityAlmuerzoMartes : AppCompatActivity() {

    private lateinit var binding: ActivityAlmuerzoMartesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlmuerzoMartesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlmuerzoMartesVolver.setOnClickListener {
            finish()
            startActivity(Intent(this@ActivityAlmuerzoMartes, ComidaMediodiaActivity::class.java))
        }
    }
}