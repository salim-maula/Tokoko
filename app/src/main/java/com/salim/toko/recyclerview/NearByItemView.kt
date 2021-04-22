package com.salim.toko.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_item_doctor.view.*

class NearByItemView(private val view: View) : RecyclerView.ViewHolder(view) {
    private lateinit var onClick: OnClickList

    fun bind(data: DoctorData) = with(view) {
        iv_doctor.setImageResource(data.image)
        tv_name.text = data.name
        tv_specialist.text = data.specialist
        rating.rating = data.rating
        container_list.setOnClickListener {
            if (::onClick.isInitialized) {
                onClick.onSelect(data)
            }
        }
    }

    fun setListener(onSelect: OnClickList) {
        this.onClick = onSelect
    }

    interface OnClickList {
        fun onSelect(data: DoctorData)
    }
}