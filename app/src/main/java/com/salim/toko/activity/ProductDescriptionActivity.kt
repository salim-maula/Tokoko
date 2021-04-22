package com.salim.toko.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.salim.toko.R
import kotlinx.android.synthetic.main.activity_product_description.*

class ProductDescriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "Tambah Produk"
        supportActionBar!!.elevation = 0f
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_product_description)

        btnSubmit.setOnClickListener {
            val go = Intent(this@ProductDescriptionActivity, SeeProduk::class.java)
            startActivity(go)
            finish()
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}