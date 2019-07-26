package com.codesignal

import org.junit.Test

/**
  * Test class for CodeFights Challenge `booze`
  *
  * @since Sep 3, 2017
  * @author froth30
  */
class boozeTest {
    
    var hours: Int = _
    var bacDecreasePerHour: Double = _
    var bacIncreasePerDrink: Double = _
    
    def testAgainst(expectedOutput: Int): Unit = {
        val output = booze.booze(hours, bacDecreasePerHour, bacIncreasePerDrink)
        
        println() // buffer between console output and following test results
        println("Input:              hours: " + hours)
        println("                    bacDecreasePerHour: " + bacDecreasePerHour)
        println("                    bacIncreasePerDrink: " + bacIncreasePerDrink)
        println("Output:             " + output)
        println("Expected Output:    " + expectedOutput)
        println("Console Output:     See above")
        
        assert(output == expectedOutput)
    }
    
    @Test
    def test1(): Unit = {
        hours = 9
        bacDecreasePerHour = 0.03
        bacIncreasePerDrink = 0.05
        
        testAgainst(7)
    }
    
    @Test
    def test2(): Unit = {
        hours = 1
        bacDecreasePerHour = 0.02
        bacIncreasePerDrink = 0.03
        
        testAgainst(3)
    }
    
    @Test
    def test3(): Unit = {
        hours = 12
        bacDecreasePerHour = 0.09
        bacIncreasePerDrink = 0.07
        
        testAgainst(6)
    }
    
    @Test
    def test4(): Unit = {
        hours = 18
        bacDecreasePerHour = 0.1
        bacIncreasePerDrink = 0.01
        
        testAgainst(45)
    }
    
    @Test
    def test5(): Unit = {
        hours = 1
        bacDecreasePerHour = 0.01
        bacIncreasePerDrink = 0.1
        
        testAgainst(0)
    }
    
    @Test
    def test6(): Unit = {
        hours = 4
        bacDecreasePerHour = 0.02
        bacIncreasePerDrink = 0.05
        
        testAgainst(3)
    }
    
    @Test
    def test7(): Unit = {
        hours = 24
        bacDecreasePerHour = 0.03
        bacIncreasePerDrink = 0.08
        
        testAgainst(5)
    }
    
}
