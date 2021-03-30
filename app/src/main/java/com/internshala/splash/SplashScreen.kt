package com.internshala.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity


class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        Handler(Looper.getMainLooper()).postDelayed({
            val startAct = Intent(this@SplashScreen, LoginActivity::class.java)
            startActivity(startAct)
        }, 2000)

    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}