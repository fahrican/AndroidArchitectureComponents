package com.example.smartherdarchitecturecomponents.lifecycle_aware_components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import com.example.smartherdarchitecturecomponents.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onResume() {
        super.onResume()
        val randomNumberViewModel = ViewModelProviders.of(this).get(RandomNumberViewModel::class.java)
        val randomNumber: String = randomNumberViewModel.getRandomNumber()
        randomNumberTextView.text = randomNumber
        Log.v(TAG, "set random number")
    }
}
