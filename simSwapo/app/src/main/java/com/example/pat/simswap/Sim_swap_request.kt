package com.example.pat.simswap

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputEditText
import android.support.design.widget.TextInputLayout
import android.util.Log
import android.view.View
import android.widget.*
import com.example.pat.simswap.R.id.reason
import kotlinx.android.synthetic.main.activity_sim_swap_request.*

class Sim_swap_request : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sim_swap_request)

        val idTypeDropdown = findViewById(R.id.idtype) as Spinner
        var options = arrayOf("NHIS","PASSPORT","VOTERS","NATIONAL ID","DRIVERS LISCENCE")
        idTypeDropdown.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)

        idTypeDropdown.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                //idtype.selectedItem.equals("ID Type")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@Sim_swap_request,"you selected"+idTypeDropdown.selectedItem.toString(),Toast.LENGTH_LONG)
            }

        }

        proceed.setOnClickListener {
            retrieveData()
        }

    }

    fun retrieveData(){
        val phoneNumber = findViewById(R.id.phone) as TextInputEditText
        val serial = findViewById<TextInputEditText>(R.id.serialNumber)
        val idNumber = findViewById<TextInputEditText>(R.id.idNumber)
        val reason = findViewById<TextInputEditText>(R.id.reason)
        val comment = findViewById<TextInputEditText>(R.id.comment)


        //val simDetails = swapDetail(phoneNumber.text.toString(),serial.text.toString(),idTypeDropdown.selectedItem.toString(),
        //idNumber.text.toString(),reason.text.toString(),comment.text.toString())

        val simDetails = swapDetail("0000","2345","wshdhdn",
                "incjbnjbnjhb","oikju","ujhync")


        startActivity(
                Intent(this,Sim_swap_Image_Attachment::class.java).putExtra("sim",simDetails))
    }

}
