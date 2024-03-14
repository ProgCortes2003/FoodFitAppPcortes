package com.example.foodfitapp_pcortes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.activities_cena.ActivityCenaDomingo
import com.example.foodfitapp_pcortes.activities_cena.ActivityCenaJueves
import com.example.foodfitapp_pcortes.activities_cena.ActivityCenaLunes
import com.example.foodfitapp_pcortes.activities_cena.ActivityCenaMartes
import com.example.foodfitapp_pcortes.activities_cena.ActivityCenaMiercoles
import com.example.foodfitapp_pcortes.activities_cena.ActivityCenaSabado
import com.example.foodfitapp_pcortes.activities_cena.ActivityCenaViernes
import com.example.foodfitapp_pcortes.databinding.ActivityComidaNocheBinding

class ComidaNocheActivity : AppCompatActivity() {

    lateinit var binding: ActivityComidaNocheBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComidaNocheBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCenaVolver.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaNocheActivity,MainActivity::class.java))
        }

        binding.btnLunesCena.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaNocheActivity, ActivityCenaLunes::class.java))
        }

        binding.btnMartesCena.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaNocheActivity, ActivityCenaMartes::class.java))
        }

        binding.btnMiercolesCena.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaNocheActivity, ActivityCenaMiercoles::class.java))
        }

        binding.btnJuevesCena.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaNocheActivity, ActivityCenaJueves::class.java))
        }

        binding.btnViernesCena.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaNocheActivity, ActivityCenaViernes::class.java))
        }

        binding.btnSabadoCena.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaNocheActivity, ActivityCenaSabado::class.java))
        }

        binding.btnDomingoCena.setOnClickListener {
            finish()
            startActivity(Intent(this@ComidaNocheActivity, ActivityCenaDomingo::class.java))
        }
    }
}