package com.ksappdev.swoosh.controllers

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ksappdev.swoosh.EXTRA_LEAGUE
import com.ksappdev.swoosh.EXTRA_SKILL
import com.ksappdev.swoosh.R
import kotlinx.android.synthetic.main.activity_screen3.*

class Screen3 : AppCompatActivity() {
    var skill = ""
    var lky=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)
        lky = intent.getStringExtra(EXTRA_LEAGUE).toString()
    }

        fun bgnrBtnClicked(view: View) {
            ballerBtn.isChecked = false
            skill = "Begginer"

        }

        fun BlrBtnClicked(view: View) {
            begginerBtn.isChecked = false
            skill = "Baller"
        }

        fun finishBtnClicked(view: View) {
            if (skill != "") {
                val finishintent = Intent(this, FinishScreen::class.java)
                finishintent.putExtra(EXTRA_LEAGUE, lky)
                finishintent.putExtra(EXTRA_SKILL, skill)
                startActivity(finishintent)
            } else {
                Toast.makeText(this, "Please select Skill set", Toast.LENGTH_SHORT).show()
            }
        }
    }
