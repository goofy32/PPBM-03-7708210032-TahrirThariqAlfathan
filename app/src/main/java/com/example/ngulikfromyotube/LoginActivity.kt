package com.example.ngulikfromyotube

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_login1 = findViewById<Button>(R.id.button2)

        btn_login1.setOnClickListener {
            val _intent: Intent = Intent(this, Dasbor::class.java)
            startActivity(_intent)

        }
    }
}
