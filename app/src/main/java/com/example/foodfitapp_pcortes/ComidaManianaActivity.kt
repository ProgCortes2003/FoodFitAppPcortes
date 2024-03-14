package com.example.foodfitapp_pcortes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.activities_desayuno.ActivityDesayunoDomingo
import com.example.foodfitapp_pcortes.activities_desayuno.ActivityDesayunoJueves
import com.example.foodfitapp_pcortes.activities_desayuno.ActivityDesayunoLunes
import com.example.foodfitapp_pcortes.activities_desayuno.ActivityDesayunoMartes
import com.example.foodfitapp_pcortes.activities_desayuno.ActivityDesayunoMiercoles
import com.example.foodfitapp_pcortes.activities_desayuno.ActivityDesayunoSabado
import com.example.foodfitapp_pcortes.activities_desayuno.ActivityDesayunoViernes
import com.example.foodfitapp_pcortes.databinding.ActivityComidaManianaBinding

class ComidaManianaActivity : AppCompatActivity() {

    lateinit var binding: ActivityComidaManianaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComidaManianaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVolverDesayuno.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaManianaActivity,MainActivity::class.java))
        }

        binding.btnLunesDesayuno.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaManianaActivity,ActivityDesayunoLunes::class.java))
        }

        binding.btnMartesDesayuno.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaManianaActivity, ActivityDesayunoMartes::class.java))
        }

        binding.btnMiercolesDesayuno.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaManianaActivity, ActivityDesayunoMiercoles::class.java))
        }

        binding.btnJuevesDesayuno.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaManianaActivity, ActivityDesayunoJueves::class.java))
        }

        binding.btnViernesDesayuno.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaManianaActivity, ActivityDesayunoViernes::class.java))
        }

        binding.btnSabadoDesayuno.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaManianaActivity, ActivityDesayunoSabado::class.java))
        }

        binding.btnDomingoDesayuno.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaManianaActivity, ActivityDesayunoDomingo::class.java))
        }
    }


}