package com.codesignal

import org.junit.Test

/** Test class for CodeSignal Challenge `josephusProblem`
  * 
  * @author froth30
  * @since  Aug 14, 2019
  */
class josephusProblem_Test {
  
  import josephusProblem._
  
  var n = 0
  var k = 0
  
  @throws[AssertionError]
  def testAgainst(expectedOutput: Int): Unit = {
    val output = josephusProblem(n, k)
    
    println()
    println(s"Input:              n: $n")
    println(s"                    k: $k")
    println(s"Output:             $output")
    println(s"Expected Output:    $expectedOutput")
    
    assert(output == expectedOutput)
  }
  
  @Test
  def test1(): Unit = {
    n = 3
    k = 2
    
    testAgainst(3)
  }
  
  @Test
  def test2(): Unit = {
    n = 7
    k = 2
    
    testAgainst(7)
  }
  
}
