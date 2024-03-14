package com.example.foodfitapp_pcortes.activities_almuerzo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaMediodiaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityAlmuerzoMiercolesBinding

class ActivityAlmuerzoMiercoles : AppCompatActivity() {

    private lateinit var binding: ActivityAlmuerzoMiercolesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlmuerzoMiercolesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlmuerzoMiercolesVolver.setOnClickListener {
            finish()
            startActivity(Intent(this@ActivityAlmuerzoMiercoles, ComidaMediodiaActivity::class.java))
        }
    }
}