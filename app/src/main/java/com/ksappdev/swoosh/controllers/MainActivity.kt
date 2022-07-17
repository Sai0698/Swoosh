package com.ksappdev.swoosh.controllers

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ksappdev.swoosh.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getstartedbtn.setOnClickListener {
            val firstIntent = Intent(this, Screen2::class.java)
            startActivity(firstIntent)

        }

    }
}