package com.codesignal

import org.junit.Test

/** Test class for CodeSignal Challenge `ballsDistribution`
  * 
  * @author froth30
  * @since  Aug 11, 2019
  */
class ballsDistribution_Test {
    
    import ballsDistribution._
    
    var colors = 0
    var ballsPerColor = 0
    var boxSize = 0

    @throws[AssertionError]
    def testAgainst(expectedOutput: Int): Unit = {
        val output = ballsDistribution(colors, ballsPerColor, boxSize)
        
        println()
        println(s"Input:              c: $colors")
        println(s"                    ballsPerColor: $ballsPerColor")
        println(s"                    boxSize: $boxSize")
        println(s"Output:             $output")
        println(s"Expected Output:    $expectedOutput")
        
        assert(output == expectedOutput)
    }
    
    @Test
    def test1(): Unit = {
        colors = 3
        ballsPerColor = 5
        boxSize = 6
        
        testAgainst(2)
    }
    
    @Test
    def test2(): Unit = {
        colors = 10
        ballsPerColor = 10
        boxSize = 9
        
        testAgainst(10)
    }
    
    @Test
    def test3(): Unit = {
        colors = 10
        ballsPerColor = 10
        boxSize = 30
        
        testAgainst(0)
    }
    
}
