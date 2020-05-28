@file:Suppress("DEPRECATION")

package com.example.janken

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.text.method.TextKeyListener.clear as clear

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gu.setOnClickListener { onJankenButtonTapped(it)}
        choki.setOnClickListener { onJankenButtonTapped(it)}
        pa.setOnClickListener { onJankenButtonTapped(it) }

//        val pref = PreferenceManager.getDefaultSharedPreferences(this)
//        pref.edit {
//            clear()
//        }

    }

    fun onJankenButtonTapped(view: View?) {
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("MY_HAND", view?.id)
        startActivity(intent)
    }
}