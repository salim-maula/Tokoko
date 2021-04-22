package com.salim.toko.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.salim.toko.R

class NearByAdapter : RecyclerView.Adapter<NearByItemView>() {
    private val data: MutableList<DoctorData> = arrayListOf()
    private lateinit var onSelect : NearByItemView.OnClickList

    fun setData(doctorData: MutableList<DoctorData>) {
        data.clear()
        data.addAll(doctorData)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NearByItemView {
        val v: View =
            LayoutInflater.from(parent.context).inflate(R.layout.view_item_doctor, parent, false)
        return NearByItemView(v)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun setListener(onSelect: NearByItemView.OnClickList){
        this.onSelect = onSelect
    }

    override fun onBindViewHolder(holder: NearByItemView, position: Int) {
        holder.setListener(onSelect)
        holder.bind(data[position])
    }


}