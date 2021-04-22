package com.salim.toko.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.salim.toko.R
import kotlinx.android.synthetic.main.activity_store.*

class StoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store)

        btnProduk.setOnClickListener {
            val go = Intent(this@StoreActivity, SeeProduk::class.java)
            startActivity(go)
        }
    }
}