package com.example.pat.simswap

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_sim_request_summary.*
import kotlinx.android.synthetic.main.activity_sim_swap_request.*

class Sim_request_summary : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sim_request_summary)

        //val simToBeSwappedDetail = intent.getSerializableExtra("simDetails") as swapDetail
        //Log.d("okete variables", simToBeSwappedDetail.comments)

        val sum = intent.getSerializableExtra("sim") as swapDetail

        Log.d("kofi things",sum.phoneNumber)


    }
}
