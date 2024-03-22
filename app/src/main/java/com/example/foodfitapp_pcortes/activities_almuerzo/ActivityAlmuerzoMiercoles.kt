package com.example.foodfitapp_pcortes.activities_almuerzo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodfitapp_pcortes.ComidaMediodiaActivity
import com.example.foodfitapp_pcortes.R
import com.example.foodfitapp_pcortes.databinding.ActivityAlmuerzoMiercolesBinding

class ActivityAlmuerzoMiercoles : AppCompatActivity() {

    private lateinit var binding: ActivityAlmuerzoMiercolesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlmuerzoMiercolesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlmuerzoMiercolesVolver.setOnClickListener {
            finish()
            startActivity(Intent(this@ActivityAlmuerzoMiercoles, ComidaMediodiaActivity::class.java))
        }

        val embebidoVideo = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/DxeZA1e2gCg?si=U9HvU_CE4fCSriVi\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"
        binding.videoAlmuerzoMiercoles.loadData(embebidoVideo,"text/html","utf-8")
        binding.videoAlmuerzoMiercoles.settings.javaScriptEnabled = true
    }
}