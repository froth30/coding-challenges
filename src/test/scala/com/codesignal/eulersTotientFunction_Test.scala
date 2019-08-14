package com.codesignal

import org.junit.Test

/** Test class for CodeSignal Challenge `eulersTotientFunction`
  * 
  * @author froth30
  * @since  Aug 14, 2019
  */
class eulersTotientFunction_Test {
  
  import eulersTotientFunction._
  
  var input = 0
  
  @throws[AssertionError]
  def testAgainst(expectedOutput: Int): Unit = {
    val output = eulersTotientFunction(input)
    
    println()
    println(s"Input:              n: $input")
    println(s"Output:             $output")
    println(s"Expected Output:    $expectedOutput")
    
    assert(output == expectedOutput)
  }
  
  @Test
  def test1(): Unit = {
    input = 5
    
    testAgainst(4)
  }
  
  @Test
  def test2(): Unit = {
    input = 49
    
    testAgainst(42)
  }
  
  @Test
  def test3(): Unit = {
    input = 1
    
    testAgainst(1)
  }
  
  @Test
  def test4(): Unit = {
    input = 69
    
    testAgainst(44)
  }
  
}
