package com.example.smartherdarchitecturecomponents.lifecycle_aware_components

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class RandomNumberViewModel : ViewModel() {

    private val TAG = "RandomNumberViewModel"
    private lateinit var randomNumber: MutableLiveData<String>

    fun createNumber() {
        Log.v(TAG, "create new random number")
        val random = Random()
        randomNumber.value = "Number: ${random.nextInt(10 - 1) + 1}"
    }

    fun getRandomNumber(): MutableLiveData<String> {
        Log.v(TAG, "get random number")
        if (!(::randomNumber.isInitialized)) {
            randomNumber = MutableLiveData()
            createNumber()
        }
        return randomNumber
    }

    override fun onCleared() {
        super.onCleared()
        Log.v(TAG, "Destroyed ViewModel")
    }
}
