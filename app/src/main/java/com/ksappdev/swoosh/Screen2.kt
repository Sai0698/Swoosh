package com.ksappdev.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)
    }

    fun secondbuttonclicked(view: View) {
        val intent = Intent(this,Screen3::class.java)
        startActivity(intent)

    }
}