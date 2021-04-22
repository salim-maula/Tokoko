package com.salim.toko

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.salim.toko.activity.home.LoginActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.activity_splash_screen)

        var handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@SplashScreen,
                LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 4000)
    }
}