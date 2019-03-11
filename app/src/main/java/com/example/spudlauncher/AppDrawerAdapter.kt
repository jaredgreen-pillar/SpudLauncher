package com.example.spudlauncher

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.app_row.view.*
import android.view.LayoutInflater




class AppDrawerAdapter(): RecyclerView.Adapter<ViewHolder>() {
    var msgList: ArrayList<String> = ArrayList()

    init {
        msgList.add("Hello")
        msgList.add("How are you")
        msgList.add("Gooood!")
        msgList.add("Thats good")
        msgList.add("You?")
        msgList.add("Same")
        msgList.add("Cool")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.app_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return msgList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val textView = holder.textView
        textView.setText(msgList[position])
    }
}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var row: ConstraintLayout
    var textView: TextView
    var img: ImageView

    init {
        row = itemView.appRow
        textView = itemView.appName
        img = itemView.appIcon
    }
}