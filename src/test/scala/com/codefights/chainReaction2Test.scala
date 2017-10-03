package com.codefights

import org.junit.Test

/**
  * Tests for CodeFights Challenge `chainReaction2`
  *
  * @since Aug 13, 2017
  * @author froth30
  */
class chainReaction2Test {
    
    import chainReaction2._
    
    var n, m = 0
    var moves: Array[Array[Int]] = _
    
    @throws[AssertionError]
    def testAgainst(expectedOutput: String): Unit = {
        val output = chainReaction2(n, m, moves)
    
        def stringFrom(moves: Array[Array[Int]]): String = {
            var str = "["
            moves.foreach(move => str += "[" + move(0) + "," + move(1) + "],\n                            ")
            str.dropRight(30) + "]"
        }
        
        println()  // buffer between console output and following test results
        println("Input:              n: " + n)
        println("                    m: " + m)
        println("                    moves: " + stringFrom(moves))
        println("Output:             " + output)
        println("Expected Output:    " + expectedOutput)
        println("Console Output:     See above")
        
        assert(output == expectedOutput)
    }
    
    @Test
    def test1(): Unit = {
        n = 2
        m = 2
        moves = Array(Array(0,0),
            Array(0,1),
            Array(0,0))
        
        testAgainst("Red won")
    }
    
    @Test
    def test2(): Unit = {
        n = 2
        m = 2
        moves = Array(Array(0,0),
            Array(1,1),
            Array(0,0),
            Array(0,0))
    
        testAgainst("draw")
    }
    
    @Test
    def test3(): Unit = {
        n = 9
        m = 6
        moves = Array(Array(0,0),
            Array(8,5),
            Array(0,0),
            Array(8,5),
            Array(0,0),
            Array(8,5),
            Array(0,0),
            Array(8,5),
            Array(7,4),
            Array(1,1),
            Array(7,4),
            Array(1,1),
            Array(7,4),
            Array(1,1),
            Array(7,4))
    
        testAgainst("draw")
    }
    
    @Test
    def test4(): Unit = {
        n = 5
        m = 2
        moves = Array(Array(0,0),
            Array(3,0),
            Array(0,0),
            Array(2,0),
            Array(0,0),
            Array(2,0),
            Array(1,0),
            Array(3,0),
            Array(1,0))
    
        testAgainst("draw")
    }
    
}
