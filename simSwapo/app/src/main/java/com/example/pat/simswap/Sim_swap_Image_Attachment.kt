package com.example.pat.simswap

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_sim_swap__image__attachment.*

class Sim_swap_Image_Attachment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sim_swap__image__attachment)



        previous.setOnClickListener {
            startActivity(Intent(this@Sim_swap_Image_Attachment,Sim_swap_request::class.java))
        }

        preview.setOnClickListener {
            startActivity(Intent(this@Sim_swap_Image_Attachment,Sim_request_summary::class.java))
        }

    }
}
