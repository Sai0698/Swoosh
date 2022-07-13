package com.ksappdev.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_screen2.*

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)
    }

    var selectedstring= ""

    fun selectedco_ed(view: View) {
        mensBtn.isChecked =false
        womensBtn.isChecked=false
        selectedstring = "co-ed"
    }
    fun selectedwomens(view: View) {
        mensBtn.isChecked =false
        coedBtn.isChecked=false

        selectedstring = "womens"
    }
    fun selectedmens(view: View) {

        coedBtn.isChecked =false
        womensBtn.isChecked=false
        selectedstring = "mens"
    }
    fun secondbuttonclicked(view: View) {
        if(selectedstring!="") {
            val intent = Intent(this, Screen3::class.java)
            intent.putExtra(EXTRA_LEAGUE,selectedstring)
            startActivity(intent)
        }else{
            Toast.makeText(this,"Kindly select one League",Toast.LENGTH_SHORT).show()
        }
    }
}