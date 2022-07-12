package com.ksappdev.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getstartedbtn.setOnClickListener {
            val firstIntent = Intent(this, screen2::class.java)
            startActivity(firstIntent)

        }

    }
}