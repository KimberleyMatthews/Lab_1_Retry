package com.example.lab_1_androidutveckling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val SecondButton: Button = findViewById(R.id.SecondButton)
        val userNameField: EditText = findViewById(R.id.NameField)
        val userName = arrayOf("Kimberley")

        SecondButton.setOnClickListener{
            val NameField = userNameField.text.toString()

            if (userName.contains(userNameField.text.toString())){
                val intentNavigate = Intent(this, LoggedInActivity::class.java)
                startActivity(intentNavigate)
        }

    }
}}