package com.example.pat.simswap

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

       val loginBtn = findViewById<Button>(R.id.loginBtn)
        loginBtn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
