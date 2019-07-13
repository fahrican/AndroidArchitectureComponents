package com.example.smartherdarchitecturecomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.v(TAG, "Owner onCreate()")
        val test = MainActivityObserver()
        lifecycle.addObserver(test)
    }

    override fun onStart() {
        super.onStart()

        Log.v(TAG, "Owner onStart()")
        val test = MainActivityObserver()
        lifecycle.addObserver(test)
    }

    override fun onResume() {
        super.onResume()

        Log.v(TAG, "Owner onResume()")
        val test = MainActivityObserver()
        lifecycle.addObserver(test)
    }

    override fun onPause() {
        super.onPause()

        Log.v(TAG, "Owner onPause()")
        val test = MainActivityObserver()
        lifecycle.addObserver(test)
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.v(TAG, "Owner onDestroy()")
        val test = MainActivityObserver()
        lifecycle.addObserver(test)
    }

    override fun onStop() {
        super.onStop()

        Log.v(TAG, "Owner onStop()")
        val test = MainActivityObserver()
        lifecycle.addObserver(test)
    }


}
