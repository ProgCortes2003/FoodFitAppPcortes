package com.example.foodfitapp_pcortes.activities_almuerzo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaMediodiaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityAlmuerzoMartesBinding

class ActivityAlmuerzoMartes : AppCompatActivity() {

    private lateinit var binding: ActivityAlmuerzoMartesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlmuerzoMartesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlmuerzoMartesVolver.setOnClickListener {
            finish()
            startActivity(Intent(this@ActivityAlmuerzoMartes, ComidaMediodiaActivity::class.java))
        }

        val embebidoVideo = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Pi0MJhEly3U?si=3yyoEs0PcVl0JNsc\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"
        binding.videoAlmuerzoMartes.loadData(embebidoVideo,"text/html","utf-8")
        binding.videoAlmuerzoMartes.settings.javaScriptEnabled = true

    }
}