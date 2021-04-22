package com.salim.toko.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.salim.toko.R
import kotlinx.android.synthetic.main.activity_add.*

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.title = "Buat Toko"
        supportActionBar!!.elevation = 0f
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_add)

        btnSubmit.setOnClickListener{
            val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            builder.setTitle("Keluar")
            builder.setIcon(R.drawable.splashscreen)
            builder.setMessage("Yeay, Toko Kamu telah terdaftar")
            builder.setNegativeButton("Tambah Produk"){dialog, which ->
                Toast.makeText(this, "Klik, Tambah Produk", Toast.LENGTH_LONG).show()
            }
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        btnAdd.setOnClickListener{
            val go = Intent(this@AddActivity, ProductDescriptionActivity::class.java)
            startActivity(go)
        }

    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }


}