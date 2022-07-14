package com.ksappdev.swoosh.controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ksappdev.swoosh.EXTRA_LEAGUE
import com.ksappdev.swoosh.EXTRA_SKILL
import com.ksappdev.swoosh.R
import kotlinx.android.synthetic.main.activity_finish_screen.*

class FinishScreen : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish_screen)
        val league= intent.getStringExtra(EXTRA_LEAGUE)
        val skil=intent.getStringExtra(EXTRA_SKILL)

        finishTxt.text="Looking for $league $skil near you...."

    }

}