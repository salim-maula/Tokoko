package com.salim.toko.activity.home

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.salim.toko.R


class WhatsaapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.activity_whatsaap)
    }

    fun openWA(view: View?) {
        val number = "6282246299806"
        val url = "https://api.whatsapp.com/send?phone=$number"
        val i = Intent(Intent.ACTION_VIEW)
        i.setPackage("com.whatsapp")
        i.data = Uri.parse(url)
        startActivity(i)
    }
}