package com.example.foodfitapp_pcortes.activities_cena

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaNocheActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityCenaMiercolesBinding

class ActivityCenaMiercoles : AppCompatActivity() {

    private lateinit var binding: ActivityCenaMiercolesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCenaMiercolesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCenaMiercolesVolver.setOnClickListener {
            startActivity(Intent(this@ActivityCenaMiercoles, ComidaNocheActivity::class.java))
        }
    }
}