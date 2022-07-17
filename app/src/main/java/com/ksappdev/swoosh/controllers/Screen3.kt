package com.ksappdev.swoosh.controllers

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ksappdev.swoosh.EXTRA_PLAYER
import com.ksappdev.swoosh.R
import com.ksappdev.swoosh.player.Player
import kotlinx.android.synthetic.main.activity_screen3.*

class Screen3 : BaseActivity() {

    lateinit var player:Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)
         player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)!!
    }

        fun bgnrBtnClicked(view: View) {
            ballerBtn.isChecked = false
            player.skill = "Beginner"

        }

        fun BlrBtnClicked(view: View) {
            begginerBtn.isChecked = false
            player.skill = "Baller"
        }

        fun finishBtnClicked(view: View) {
            if (player.skill != "") {
                val finishintent = Intent(this, FinishScreen::class.java)
                finishintent.putExtra(EXTRA_PLAYER,player)
                startActivity(finishintent)
            } else {
                Toast.makeText(this, "Please select Skill set", Toast.LENGTH_SHORT).show()
            }
        }
    }
