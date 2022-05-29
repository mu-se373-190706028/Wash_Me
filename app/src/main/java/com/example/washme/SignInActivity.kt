package com.example.washme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        findViewById<Button>(R.id.sign_in_button2).setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}