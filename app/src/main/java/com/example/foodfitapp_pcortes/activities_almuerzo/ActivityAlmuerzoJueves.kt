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

        val embebidoVideo = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/EPuCEXdTL2g?si=KzZ5MAR6m-8aRAYE\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"
        binding.videoAlmuerzoJueves.loadData(embebidoVideo,"text/html","utf-8")
        binding.videoAlmuerzoJueves.settings.javaScriptEnabled = true
    }


}