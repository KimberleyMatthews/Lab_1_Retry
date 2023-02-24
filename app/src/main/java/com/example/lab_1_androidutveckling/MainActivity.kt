package com.example.lab_1_androidutveckling

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val FirstButton: Button = findViewById(R.id.FirstButton)
        FirstButton.setOnClickListener{
           val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}