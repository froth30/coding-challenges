package com.codefights

import org.junit.Test

/** Test class for CodeFights Challenge `addDigits`
  * 
  * @author froth30
  * @since  Nov 04, 2017
  */
class addDigits_Test {
    
    import addDigits._
    
    var a = 0
    var b = 0
    var n = 0
    
    @throws[AssertionError]
    def testAgainst(expectedOutput: String): Unit = {
        val output = addDigits(a, b, n)
        
        println()
        println("Input:              a: " + a)
        println("                    b: " + b)
        println("                    n: " + n)
        println("Output:             \"" + output + "\"")
        println("Expected Output:    \"" + expectedOutput + "\"")
        
        assert(output == expectedOutput)
    }
    
    @Test
    def test1(): Unit = {
        a = 12
        b = 11
        n = 2
        
        testAgainst("1210")
    }
    
    @Test
    def test2(): Unit = {
        a = 4
        b = 13
        n = 10
        
        testAgainst("4")
    }
    
    @Test
    def test3(): Unit = {
        a = 5
        b = 13
        n = 10
        
        testAgainst("52000000000")
    }
    
    @Test
    def test4(): Unit = {
        a = 4
        b = 3
        n = 9
        
        testAgainst("4899999999")
    }
    
    @Test
    def test5(): Unit = {
        a = 412
        b = 11
        n = 4
        
        testAgainst("4125000")
    }
    
}
