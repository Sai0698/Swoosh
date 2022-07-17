package com.ksappdev.swoosh.controllers

import android.os.Bundle
import com.ksappdev.swoosh.EXTRA_PLAYER
import com.ksappdev.swoosh.R
import com.ksappdev.swoosh.player.Player
import kotlinx.android.synthetic.main.activity_finish_screen.*

class FinishScreen : BaseActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish_screen)
        val player= intent.getParcelableExtra<Player>(EXTRA_PLAYER)


        if (player != null) {
            finishTxt.text="Looking for ${player.league} ${player.skill} near you...."
        }

}
}