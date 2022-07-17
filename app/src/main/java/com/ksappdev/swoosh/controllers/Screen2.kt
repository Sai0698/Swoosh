package com.ksappdev.swoosh.controllers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ksappdev.swoosh.EXTRA_PLAYER
import com.ksappdev.swoosh.R
import com.ksappdev.swoosh.player.Player
import kotlinx.android.synthetic.main.activity_screen2.*

class Screen2 : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)
    }

    var player=Player("","")

    fun selectedco_ed(view: View) {
        mensBtn.isChecked =false
        womensBtn.isChecked=false
        player.league = "co-ed"
    }
    fun selectedwomens(view: View) {
        mensBtn.isChecked =false
        coedBtn.isChecked=false

        player.league = "womens"
    }
    fun selectedmens(view: View) {

        coedBtn.isChecked =false
        womensBtn.isChecked=false
        player.league = "mens"
    }
    fun secondbuttonclicked(view: View) {
        if(player.league!="") {
            val skillintent = Intent(this, Screen3::class.java)
            skillintent.putExtra(EXTRA_PLAYER,player)
            startActivity(skillintent)
        }else{
            Toast.makeText(this,"Kindly select one League",Toast.LENGTH_SHORT).show()
        }
    }
}