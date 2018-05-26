package com.example.pat.simswap

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_verification_detail.*

class VerificationDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification_detail)

        proceedToSwapping.setOnClickListener {
            startActivity(Intent(this,Sim_swap_request::class.java))
        }
    }
}
