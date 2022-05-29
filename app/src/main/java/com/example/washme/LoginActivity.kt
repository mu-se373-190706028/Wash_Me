package com.example.washme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginn)

        findViewById<Button>(R.id.sign_in_button).setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
        }
        findViewById<Button>(R.id.sign_up_button).setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
            finish()
        }


    }


}