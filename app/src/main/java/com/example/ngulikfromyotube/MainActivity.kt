package com.example.ngulikfromyotube

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.SplashScreenTheme)
        setContentView(R.layout.activity_main)

        val btn_splash = findViewById<Button>(R.id.buttonsplash)
        btn_splash.setOnClickListener {
            val _intent: Intent = Intent(this, registers::class.java)
            startActivity(_intent)
        }
    }
}