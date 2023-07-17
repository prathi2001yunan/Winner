package com.example.cryptondemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cryptondemo.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity(),Recycle2.OnItemClickListener {
    private var bind1:ActivityMain3Binding?=null
    private var list1:ArrayList<Data3>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind1 = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(bind1?.root)
        list1 = ArrayList<Data3>()

        list1!!.add((Data3("chap1","Introduction","0")))
        list1!!.add((Data3("chap1","Introduction","0")))

        list1!!.add((Data3("chap1","Introduction","0")))

        list1!!.add((Data3("chap1","Introduction","0")))
        val list2 = Recycle2(list1!!,this)
        bind1?.rec?.adapter=list2


        val list4 = ArrayList<Data2>()
        list4.add(Data2("simple1"))
        list4.add(Data2("simple2"))
        list4.add(Data2("simple3"))
        val list7 = Recycle3(list4)
           bind1?.rec2?.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        bind1?.rec2?.adapter=list7



    }

    override fun OnitemClick(position: Int) {
        var n =list1!![position].nam2.toInt()
       list1!![position].nam2= (n+1).toString()
        Toast.makeText(this,"hello",Toast.LENGTH_LONG).show()
        bind1?.rec?.adapter?.notifyItemChanged(position)
    }
}