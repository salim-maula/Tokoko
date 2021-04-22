package com.salim.toko.activity.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.salim.toko.R
import com.salim.toko.activity.HomeActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.activity_login)

        btnRegister.setOnClickListener {
            val go = Intent(this@LoginActivity, WhatsaapActivity::class.java)
            startActivity(go)
        }
        btnLogin.setOnClickListener {
            val go = Intent(this@LoginActivity, HomeActivity::class.java)
            startActivity(go)
            finish()
        }
    }
}