package com.salim.toko.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.salim.toko.R

class SeeProduk : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "Produk Saya"
        supportActionBar!!.elevation = 0f
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_see_produk)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}