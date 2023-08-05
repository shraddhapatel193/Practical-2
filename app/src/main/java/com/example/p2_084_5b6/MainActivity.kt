package com.example.p2_084_5b6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    val Tag = " MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "MADPractical-1_084_B6"


    }

    override fun onStart() {
        super.onStart()
        Display("onStart function is called")
        showSnackbar()
    }

    override fun onResume() {
        super.onResume()
        Display("onResume function is called")
        showSnackbar()

    }

    override fun onPause() {
        super.onPause()
        Display("onPause function is called")

    }

    override fun onStop() {
        super.onStop()
        Display("onStop function is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Display("OnDestroy function is called")

    }
    fun Display(msg:String){
        Toast.makeText(this,"this is $msg",Toast.LENGTH_LONG).show()
        Log.i(Tag," $msg is called")
    }
    private fun showSnackbar() {
        val myCoordinatorLayout = findViewById<CoordinatorLayout>(R.id.myCoordinatorLayout)
        Snackbar.make(myCoordinatorLayout,R.string.snakbar,Snackbar.LENGTH_SHORT).show()
    }


}