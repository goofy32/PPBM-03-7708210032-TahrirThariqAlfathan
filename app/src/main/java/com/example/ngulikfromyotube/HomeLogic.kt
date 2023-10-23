package com.example.ngulikfromyotube

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class HomeLogic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.SplashScreenTheme)
        setContentView(R.layout.fragment_home)

        val btn_profile = findViewById<ImageView>(R.id.profileimage)
        btn_profile.setOnClickListener {
            val _intent: Intent = Intent(this, ProfileActivity::class.java)
            startActivity(_intent)
        }
    }
}