package com.example.cryptondemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cryptondemo.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private var bind2:ActivityMain2Binding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind2=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(bind2?.root)
        var listk = ArrayList<Data>()
        listk.add(Data("chapter 1","Introduction"))
        listk.add(Data("chapter 2","Study Material"))
        listk.add(Data("chapter 1","Introduction"))
        listk.add(Data("chapter 2","Study Material"))
        listk.add(Data("chapter 1","Introduction"))
        listk.add(Data("chapter 2","Study Material"))

        val listn=Recycle(listk)
        bind2?.rec?.adapter=listn
        listn.onClick={
            startActivity(Intent(this@MainActivity2,MainActivity3::class.java))
        }

    }
}