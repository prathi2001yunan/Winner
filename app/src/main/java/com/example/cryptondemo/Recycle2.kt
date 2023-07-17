package com.example.cryptondemo

import android.view.LayoutInflater
import android.view.View


import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Recycle2(val list:List<Data3>, private val listener: MainActivity3):RecyclerView.Adapter<Recycle2.MainHolder>() {

    inner class MainHolder(val item: View):RecyclerView.ViewHolder(item),View.OnClickListener{
        val nam:TextView = item.findViewById(R.id.textView)
        val nam2:TextView = item.findViewById(R.id.textView2)
        val nam3:TextView = item.findViewById(R.id.textView3)
        init {
            item.setOnClickListener(this)
        }
        override fun onClick(p0: View?) {
            val position:Int=adapterPosition
            if(position!=RecyclerView.NO_POSITION) {
                listener.OnitemClick(position)
            }
        }


        }






interface OnItemClickListener{
        fun OnitemClick(position: Int)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return (MainHolder(LayoutInflater.from(parent.context).inflate(R.layout.simple2,parent,false)))

    }



    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {

      holder.nam.setText(list[position].nam)
       holder.nam2.setText(list[position].nam1)
        holder.nam3.setText(list[position].nam2.toString())



    }
}