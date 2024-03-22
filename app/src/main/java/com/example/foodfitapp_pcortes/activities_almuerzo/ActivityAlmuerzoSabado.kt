package com.example.foodfitapp_pcortes.activities_almuerzo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaMediodiaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityAlmuerzoSabadoBinding

class ActivityAlmuerzoSabado : AppCompatActivity() {
    private lateinit var binding: ActivityAlmuerzoSabadoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlmuerzoSabadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlmuerzoSabadoVolver.setOnClickListener {
            startActivity(Intent(this@ActivityAlmuerzoSabado, ComidaMediodiaActivity::class.java))
        }

        val embebidoVideo = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/4ouoIgFpH78?si=4S5aYUxArCwoTto_\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"
        binding.videoAlmuerzoSabado.loadData(embebidoVideo,"text/html","utf-8")
        binding.videoAlmuerzoSabado.settings.javaScriptEnabled = true
    }
}