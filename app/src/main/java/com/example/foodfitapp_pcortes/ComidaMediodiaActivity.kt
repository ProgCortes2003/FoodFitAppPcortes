package com.example.foodfitapp_pcortes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.activities_almuerzo.ActivityAlmuerzoDomingo
import com.example.foodfitapp_pcortes.activities_almuerzo.ActivityAlmuerzoJueves
import com.example.foodfitapp_pcortes.activities_almuerzo.ActivityAlmuerzoLunes
import com.example.foodfitapp_pcortes.activities_almuerzo.ActivityAlmuerzoMartes
import com.example.foodfitapp_pcortes.activities_almuerzo.ActivityAlmuerzoMiercoles
import com.example.foodfitapp_pcortes.activities_almuerzo.ActivityAlmuerzoSabado
import com.example.foodfitapp_pcortes.activities_almuerzo.ActivityAlmuerzoViernes
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

        binding.btnLunesAlmuerzo.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaMediodiaActivity, ActivityAlmuerzoLunes::class.java))
        }

        binding.btnMartesAlmuerzo.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaMediodiaActivity, ActivityAlmuerzoMartes::class.java))
        }

        binding.btnMiercolesAlmuerzo.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaMediodiaActivity, ActivityAlmuerzoMiercoles::class.java))
        }

        binding.btnJuevesAlmuerzo.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaMediodiaActivity, ActivityAlmuerzoJueves::class.java))
        }

        binding.btnViernesAlmuerzo.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaMediodiaActivity, ActivityAlmuerzoViernes::class.java))
        }

        binding.btnSabadoAlmuerzo.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaMediodiaActivity, ActivityAlmuerzoSabado::class.java))
        }

        binding.btnDomingoAlmuerzo.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaMediodiaActivity, ActivityAlmuerzoDomingo::class.java))
        }
    }
}