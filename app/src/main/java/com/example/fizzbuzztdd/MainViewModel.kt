package com.example.fizzbuzztdd

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val fizzBuzz = FizzBuzz()

    val liveData = MutableLiveData<List<String>>()

    init {
        getFizzBuzzNumbers()
    }

    private fun getFizzBuzzNumbers() {
        val list = fizzBuzz.getConvertedList()
        liveData.postValue(list)
    }

}