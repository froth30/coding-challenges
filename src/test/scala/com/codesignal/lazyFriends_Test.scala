package com.codesignal

import org.junit.Test

import com.Strings
import com.Strings.ImplicitConversions._

/** Test class for CodeFights Challenge `lazyFriends`
  * 
  * @author froth30
  * @since  Oct 16, 2017
  */
class lazyFriends_Test {
    
    import lazyFriends._
    
    var houses  : Array[Int]  = _
    var maxDist : Int         = _
    
    @throws[AssertionError]
    def testAgainst(expectedOutput: Array[Int]): Unit = {
        val output = lazyFriends(houses, maxDist)
        
        println()
        println("Input:              houses: " + Strings.fromArray(houses))
        println("                    maxDist: " + maxDist)
        println("Output:             " + Strings.fromArray(output))
        println("Expected Output:    " + Strings.fromArray(expectedOutput))
        
        assert(output sameElements expectedOutput)
    }
    
    @Test
    def test1(): Unit = {
        houses = "[1, 2, 4, 8, 10]"
        maxDist = 5
        
        testAgainst("[2, 2, 3, 2, 1]")
    }
    
    @Test
    def test2(): Unit = {
        houses = "[-5, 0, 5, 10, 15]"
        maxDist = 10
        
        testAgainst("[2, 3, 4, 3, 2]")
    }
    
    @Test
    def test3(): Unit = {
        houses = "[1]"
        maxDist = 1000
        
        testAgainst("[0]")
    }
    
    @Test
    def test4(): Unit = {
        houses = "[1, 2, 3, 4, 5, 6]"
        maxDist = 3
        
        testAgainst("[3, 4, 5, 5, 4, 3]")
    }
    
    @Test
    def test5(): Unit = {
        houses = "[1, 2, 3, 10]"
        maxDist = 2
        
        testAgainst("[2, 2, 2, 0]")
    }
    
}
