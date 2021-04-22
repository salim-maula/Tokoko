package com.salim.toko.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.salim.toko.R
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_detail.view.*
import kotlinx.android.synthetic.main.view_item_doctor.view.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        setContentView(R.layout.activity_detail)
        //mengambil data dikirim

    }
}