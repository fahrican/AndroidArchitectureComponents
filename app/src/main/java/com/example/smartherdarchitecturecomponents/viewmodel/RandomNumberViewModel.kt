package com.example.smartherdarchitecturecomponents.lifecycle_aware_components

import android.util.Log
import androidx.lifecycle.ViewModel
import java.util.*

class RandomNumberViewModel :ViewModel()  {

    private val TAG = "RandomNumberViewModel"
    private lateinit var randomNumber: String

    private fun createNumber() {
        Log.v(TAG, "create new random number")
        val random = Random()
        randomNumber = "Number: ${random.nextInt(10 - 1) + 1}"
    }

    fun getRandomNumber(): String {
        Log.v(TAG, "get random number")
        if (!(::randomNumber.isInitialized)) {
            createNumber()
        }
        return randomNumber
    }

    override fun onCleared() {
        super.onCleared()
        Log.v(TAG, "Destroyed ViewModel")
    }
}
