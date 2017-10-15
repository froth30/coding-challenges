package com.codefights

import org.junit.Test

/** Test class for CodeFights Challenge `magicArrows`
  * 
  * @author froth30
  * @since  Oct 15, 2017
  */
class magicArrows_Test {
    
    import magicArrows._
    
    var villain:       Int  = _
    var minions: Array[Int] = _
    
    @throws[AssertionError]
    def testAgainst(expectedOutput: Double): Unit = {
        val output = magicArrows(villain, minions)
        
        def stringFrom(a: Array[Int]): String = {
            val str =
                if (a isEmpty)  ""
                else  a.map(_ + ", ").mkString.dropRight(2)
            
            "[" + str + "]"
        }
        
        println()
        println("Input:              villain: " + villain)
        println("                    minions: " + stringFrom(minions))
        println("Output:             " + output)
        println("Expected Output:    " + expectedOutput)
        
        assert(output == expectedOutput)
    }
    
    @Test
    def test1(): Unit = {
        villain = 2
        minions = Array()
        
        testAgainst(2)
    }
    
    @Test
    def test2(): Unit = {
        villain = 1
        minions = Array(1)
        
        testAgainst(1.5)
    }
    
    @Test
    def test3(): Unit = {
        villain = 2
        minions = Array(1)
        
        testAgainst(2.75)
    }
    
    @Test
    def test4(): Unit = {
        villain = 1
        minions = Array(1, 1)
        
        testAgainst(2)
    }
    
    @Test
    def test5(): Unit = {
        villain = 2
        minions = Array(1, 1)
        
        testAgainst(3.5)
    }
    
    @Test
    def test6(): Unit = {
        villain = 5
        minions = Array(1)
        
        testAgainst(5.96875)
    }
    
    @Test
    def test7(): Unit = {
        villain = 4
        minions = Array(1, 2, 3, 4)
        
        testAgainst(12)
    }
    
    @Test
    def test8(): Unit = {
        villain = 2
        minions = Array(4, 1)
        
        testAgainst(4.5)
    }
    
}
