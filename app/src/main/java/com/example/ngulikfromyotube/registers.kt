package com.example.ngulikfromyotube

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class registers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registers)

        val btn_tologin = findViewById<Button>(R.id.button708)
        btn_tologin.setOnClickListener {
            val _intent: Intent = Intent(this, LoginActivity::class.java)
            startActivity(_intent)
        }
    }
}