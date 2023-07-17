package com.example.cryptondemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptondemo.databinding.Simple2Binding
import com.example.cryptondemo.databinding.Simple3Binding
import com.example.cryptondemo.databinding.SimpleBinding

class Recycle3(val list:List<Data2>):RecyclerView.Adapter<Recycle3.MainHolder>() {
    var onClick:((Data)->Unit)?=null
    inner class MainHolder(val item: Simple3Binding):RecyclerView.ViewHolder(item.root){
        val nam = item.tex


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return(MainHolder(Simple3Binding.inflate(LayoutInflater.from(parent.context),parent,false)))
    }



    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.nam.setText(list[position].nam)

    }
}