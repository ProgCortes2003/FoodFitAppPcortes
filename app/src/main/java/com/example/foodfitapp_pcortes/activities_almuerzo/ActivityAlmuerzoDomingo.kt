package com.example.foodfitapp_pcortes.activities_almuerzo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaMediodiaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityAlmuerzoDomingoBinding

class ActivityAlmuerzoDomingo : AppCompatActivity() {
    private lateinit var binding: ActivityAlmuerzoDomingoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlmuerzoDomingoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlmuerzoDomingoVolver.setOnClickListener {
            startActivity(Intent(this@ActivityAlmuerzoDomingo, ComidaMediodiaActivity::class.java))
        }

        val embebidoVideo = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/fVRzpIMQliw?si=mTcWRcEGe8soIbHV\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"
        binding.videoAlmuerzoDomingo.loadData(embebidoVideo,"text/html","utf-8")
        binding.videoAlmuerzoDomingo.settings.javaScriptEnabled = true
    }
}