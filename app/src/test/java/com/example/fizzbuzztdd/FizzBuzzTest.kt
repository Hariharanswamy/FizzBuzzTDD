package com.example.fizzbuzztdd

import org.junit.Assert
import org.junit.Test


class FizzBuzzTest {

    private val fizzBuzz = FizzBuzz()

    /**
     * Testing a number like 1,2 which are not divisible by 3 and 5
     */
    @Test
    fun convertNumber_NotDivisibleBy3And5_SameNumber() {
        val convertNumber = fizzBuzz.convertNumber(1)
        Assert.assertEquals("1", convertNumber)
        val convertNumber2 = fizzBuzz.convertNumber(8)
        Assert.assertEquals("8", convertNumber2)
    }

    /**
     * Testing a number which are divisible by 3 but not 5
     */
    @Test
    fun convertNumber_DivisibleBy3_FizzReturned(){
        val convertNumber = fizzBuzz.convertNumber(3)
        Assert.assertEquals("Fizz", convertNumber)
        val convertNumber2 = fizzBuzz.convertNumber(9)
        Assert.assertEquals("Fizz", convertNumber2)
    }

    /**
     * Testing a number which are divisible by 5 but not 3
     */
    @Test
    fun convertNumber_DivisibleBy5_BuzzReturned(){
        val convertNumber = fizzBuzz.convertNumber(5)
        Assert.assertEquals("Buzz", convertNumber)
        val convertNumber2 = fizzBuzz.convertNumber(25)
        Assert.assertEquals("Buzz", convertNumber2)
    }

    /**
     * Testing a number which are divisible by 3 and 5
     */
    @Test
    fun convertNumber_DivisibleBy3And5_FizzBuzzReturned(){
        val convertNumber = fizzBuzz.convertNumber(15)
        Assert.assertEquals("FizzBuzz", convertNumber)
        val convertNumber2 = fizzBuzz.convertNumber(45)
        Assert.assertEquals("FizzBuzz", convertNumber2)
    }

    /**
     * Testing in the list if all conditions are met
     */
    @Test
    fun convertList_FizzBuzzReturned(){
        val list = fizzBuzz.getConvertedList()
        Assert.assertEquals("8", list[7])
        Assert.assertEquals("Fizz", list[8])
        Assert.assertEquals("Buzz", list[9])
        Assert.assertEquals("FizzBuzz", list[14])
    }

}