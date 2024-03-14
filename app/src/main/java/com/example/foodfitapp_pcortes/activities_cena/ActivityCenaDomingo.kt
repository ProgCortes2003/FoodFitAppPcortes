package com.example.foodfitapp_pcortes.activities_cena

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaMediodiaActivity
import com.example.foodfitapp_pcortes.ComidaNocheActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityAlmuerzoDomingoBinding
import com.example.foodfitapp_pcortes.databinding.ActivityAlmuerzoSabadoBinding
import com.example.foodfitapp_pcortes.databinding.ActivityCenaDomingoBinding

class ActivityCenaDomingo : AppCompatActivity() {
    private lateinit var binding: ActivityCenaDomingoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCenaDomingoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCenaDomingoVolver.setOnClickListener {
            startActivity(Intent(this@ActivityCenaDomingo, ComidaNocheActivity::class.java))
        }
    }
}