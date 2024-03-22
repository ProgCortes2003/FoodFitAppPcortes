package com.example.foodfitapp_pcortes.activities_almuerzo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaMediodiaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityAlmuerzoLunesBinding

class ActivityAlmuerzoLunes : AppCompatActivity() {

    private lateinit var binding: ActivityAlmuerzoLunesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlmuerzoLunesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlmuerzoLunesVolver.setOnClickListener {
            finish()
            startActivity(Intent(this@ActivityAlmuerzoLunes, ComidaMediodiaActivity::class.java))
        }

        val embebidoVideo = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/pe7VStTN3Io?si=P5GkKQ0QZea8MxOZ\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"
        binding.videoAlmuerzoLunes.loadData(embebidoVideo,"text/html","utf-8")
        binding.videoAlmuerzoLunes.settings.javaScriptEnabled = true

    }


}