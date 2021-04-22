package com.salim.toko.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.salim.toko.R
import com.salim.toko.recyclerview.DetailActivity
import com.salim.toko.recyclerview.DoctorData
import com.salim.toko.recyclerview.NearByAdapter
import com.salim.toko.recyclerview.NearByItemView
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_home.view.*

class HomeActivity : AppCompatActivity(), NearByItemView.OnClickList {

    private val nearByData: MutableList<DoctorData> = arrayListOf()

    private val adapterNearBy = NearByAdapter()

    private val fresherAdapter = NearByAdapter()

    private val rotateOpen: Animation by lazy { AnimationUtils.loadAnimation(this,R.anim.rotate_open_anim) }
    private val rotateClose: Animation by lazy { AnimationUtils.loadAnimation(this,R.anim.rotate_close_anim) }
    private val fromBottom: Animation by lazy { AnimationUtils.loadAnimation(this,R.anim.from_bottom_anim) }
    private val toBottom: Animation by lazy { AnimationUtils.loadAnimation(this,R.anim.to_bottom_anim) }

    private var clicked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        initData()
        setDataNearBy()
        setDataFresher()

        home.setOnClickListener {
            onAddButtonClick()
        }
        fab_add.setOnClickListener {
            val go = Intent(this@HomeActivity, AddActivity::class.java)
            startActivity(go)
        }
        fab_store.setOnClickListener {
            val go = Intent(this@HomeActivity, StoreActivity::class.java)
            startActivity(go)
        }

    }

    private fun setDataFresher() {
        val manager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_fresher_doctor.layoutManager = manager
        rv_fresher_doctor.adapter = fresherAdapter
        fresherAdapter.setListener(this)
        fresherAdapter.setData(nearByData)
    }

    private fun setDataNearBy() {
        val manager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_near_by_doctor.layoutManager = manager
        rv_near_by_doctor.adapter = adapterNearBy
        adapterNearBy.setListener(this)
        adapterNearBy.setData(nearByData)
    }

    private fun initData() {
        val doctor1 = DoctorData(
            "Kulinerin Aja",
            R.drawable.ketoprak,
            "Ketoprak",
            4.0f
        )
        nearByData.add(doctor1)

        val doctor2 = DoctorData(
            "Jajanan Betawi",
            R.drawable.tape,
            "Tape Uli",
            4.5f
        )
        nearByData.add(doctor2)

        val doctor3 = DoctorData(
            "Asli Betawi",
            R.drawable.keraktelor,
            "Kerak Telor",
            4.0f
        )
        nearByData.add(doctor3)

        val doctor4 = DoctorData(
            "Cemilan Enak",
            R.drawable.bikaambon,
            "Bika Ambon",
            3.9f
        )
        nearByData.add(doctor4)

        val doctor5 = DoctorData(
            "Toko Asinan",
            R.drawable.asinan,
            "Asinan Sayur",
            4.5f
        )
        nearByData.add(doctor5)

        val doctor6 = DoctorData(
            "Toko Kue",
            R.drawable.apem,
            "Kue Apem",
            4.8f
        )
        nearByData.add(doctor6)
    }

    private fun onAddButtonClick() {
        setVisibility(clicked)
        setAnimation(clicked)
        clicked = !clicked
    }

    private fun setAnimation(clicked : Boolean) {
        if (!clicked){
            fab_store.startAnimation(fromBottom)
            fab_add.startAnimation(fromBottom)
            home.startAnimation(rotateOpen)
        }else{
            fab_store.startAnimation(toBottom)
            fab_add.startAnimation(toBottom)
            home.startAnimation(rotateClose)
        }
    }

    private fun setVisibility(clicked : Boolean) {
        if(!clicked){
            fab_add.visibility = View.VISIBLE
            fab_store.visibility = View.VISIBLE
        }else{
            fab_add.visibility = View.INVISIBLE
            fab_store.visibility = View.INVISIBLE
        }
    }

    override fun onSelect(data: DoctorData) {
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }
}