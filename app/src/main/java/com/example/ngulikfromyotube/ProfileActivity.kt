package com.example.ngulikfromyotube

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btn_todev = findViewById<ImageView>(R.id.imageView8)
        btn_todev.setOnClickListener {
            val _intent: Intent = Intent(this, Developer::class.java)
            startActivity(_intent)
        }
    }
}
