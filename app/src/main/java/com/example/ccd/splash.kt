package com.example.ccd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.WindowManager
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class splash : AppCompatActivity() {
    lateinit var bt: AppCompatButton;
    lateinit var signin: TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        bt = findViewById(R.id.login)
        signin = findViewById(R.id.register)
        bt.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        })

        signin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        })
    }
}