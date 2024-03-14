package com.example.foodfitapp_pcortes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }
}