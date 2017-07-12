package com.codefights

import org.junit.Test

/**
  * Created by froth30 on 7/12/2017.
  */
class RacersTest {
    
    import Racers._
    
    var track: Int = _
    var accel: Array[Int] = _
    var spd: Array[Int] = _
    
    def testAgainst(expectedOutput: Array[Int]): Unit = {
        val output = racers(track, accel, spd)
        
        def stringFrom(arr: Array[Int]): String = {
            var str = "["
            arr.foreach(str += _ + ", ")
            str.dropRight(2) + "]"
        }
        
        println() // buffer between console output and following test results
        println("Input:              track: " + track)
        println("                    accel: " + stringFrom(accel))
        println("                    spd: " + stringFrom(spd))
        println("Output:             " + stringFrom(output))
        println("Expected Output:    " + stringFrom(expectedOutput))
        println("Console Output:     See above")
        
        assert(output sameElements expectedOutput)
    }
    
    @Test
    def test1(): Unit = {
        track = 10
        accel = Array(2, 2)
        spd = Array(2, 4)
        
        testAgainst(Array(1, 0))
    }
    
    @Test
    def test2(): Unit = {
        track = 10
        accel = Array(2, 2)
        spd = Array(2, 2)
    
        testAgainst(Array(0, 1))
    }
    
    @Test
    def test3(): Unit = {
        track = 10
        accel = Array(2, 4)
        spd = Array(2, 2)
    
        testAgainst(Array(1, 0))
    }
    
    @Test
    def test4(): Unit = {
        track = 1
        accel = Array(5, 10, 15)
        spd = Array(20, 10, 5)
    
        testAgainst(Array(2, 1, 0))
    }
    
    @Test
    def test5(): Unit = {
        track = 27
        accel = Array(3, 2, 2, 18, 14, 9)
        spd = Array(151, 236, 152, 15, 163, 275)
        
        testAgainst(Array(3, 4, 5, 1, 0, 2))
    }
    
}
