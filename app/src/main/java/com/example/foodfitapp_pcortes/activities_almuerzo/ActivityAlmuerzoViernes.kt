package com.example.foodfitapp_pcortes.activities_almuerzo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaMediodiaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityAlmuerzoViernesBinding

class ActivityAlmuerzoViernes : AppCompatActivity() {
    private lateinit var binding: ActivityAlmuerzoViernesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlmuerzoViernesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlmuerzoViernesVolver.setOnClickListener {
            startActivity(Intent(this@ActivityAlmuerzoViernes,ComidaMediodiaActivity::class.java))
        }

        val embebidoVideo = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/z_nds0WNCgU?si=Q1l3fCeazcBxa6G9\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"
        binding.videoAlmuerzoViernes.loadData(embebidoVideo,"text/html","utf-8")
        binding.videoAlmuerzoViernes.settings.javaScriptEnabled = true
    }
}