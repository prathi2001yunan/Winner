package com.example.cryptondemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cryptondemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var bind:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind?.root)
        bind?.button?.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}