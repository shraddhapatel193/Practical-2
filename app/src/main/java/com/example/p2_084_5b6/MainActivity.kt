package com.example.p2_084_5b6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    val Tag = " MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Display("onStart")
    }

    override fun onResume() {
        super.onResume()
        Display("onResume")
    }

    override fun onPause() {
        super.onPause()
        Display("onPause")
    }

    override fun onStop() {
        super.onStop()
        Display("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Display("Ondestroy")
    }
    fun Display(msg:String){
        Toast.makeText(this,"this is $msg",Toast.LENGTH_LONG).show()
        Log.i(Tag," $msg is called")
    }
}