package com.ksappdev.swoosh.controllers

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ksappdev.swoosh.EXTRA_LEAGUE
import com.ksappdev.swoosh.R
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
            val skillintent = Intent(this, Screen3::class.java)
            skillintent.putExtra(EXTRA_LEAGUE,selectedstring)
            startActivity(skillintent)
        }else{
            Toast.makeText(this,"Kindly select one League",Toast.LENGTH_SHORT).show()
        }
    }
}