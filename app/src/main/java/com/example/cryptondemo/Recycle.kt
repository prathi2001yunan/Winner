package com.example.cryptondemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptondemo.databinding.SimpleBinding

class Recycle(val list:List<Data>):RecyclerView.Adapter<Recycle.MainHolder>() {
    var onClick:((Data)->Unit)?=null
    inner class MainHolder(val item:SimpleBinding):RecyclerView.ViewHolder(item.root){
        val nam = item.text1
        val nam2 = item.text2

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(SimpleBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
       holder.nam.setText(list[position].nam)
        holder.nam2.setText(list[position].nam1)
        holder.itemView.setOnClickListener{
            onClick?.invoke(list[position])
        }
    }
}