package com.example.fizzbuzztdd

class FizzBuzz {

    fun getConvertedList(): List<String> {
        val list = mutableListOf<String>()
        for (i in 1..100) {
            list.add(convertNumber(i))
        }
        return list
    }


    fun convertNumber(num: Int): String {
        val result = num.toString()
        if (num > 0) {
            if (num % 3 == 0 && num % 5 == 0) {
                return "FizzBuzz"
            } else if (num % 3 == 0) {
                return "Fizz"
            } else if (num % 5 == 0) {
                return "Buzz"
            }
        }
        return result
    }
}