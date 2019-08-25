package com.codesignal

import org.junit.Test

/** Test class for CodeSignal Challenge `regularBracketSequence1`
  * 
  * @author froth30
  * @since  Aug 25, 2019
  */
class regularBracketSequence1_Test {
  
  import regularBracketSequence1._
  
  var sequence = ""

  @throws[AssertionError]
  def testAgainst(expectedOutput: Boolean): Unit = {
    val output = regularBracketSequence1(sequence)

    println()
    println(s"Input:              in: $sequence")
    println(s"Output:             $output")
    println(s"Expected Output:    $expectedOutput")

    assert(output == expectedOutput)
  }

  @Test
  def test01(): Unit = {
    sequence = "()()"

    testAgainst(true)
  }

  @Test
  def test02(): Unit = {
    sequence = "((())"

    testAgainst(false)
  }

  @Test
  def test03(): Unit = {
    sequence = "(())()()()"

    testAgainst(true)
  }

  @Test
  def test04(): Unit = {
    sequence = ")))((("

    testAgainst(false)
  }

  @Test
  def test05(): Unit = {
    sequence = "))())"
    
    testAgainst(false)
  }

  @Test
  def test06(): Unit = {
    sequence = "(())()(())"

    testAgainst(true)
  }

  @Test
  def test07(): Unit = {
    sequence = "())()))"

    testAgainst(false)
  }

  @Test
  def test08(): Unit = {
    sequence = ")))())))("

    testAgainst(false)
  }

  @Test
  def test09(): Unit = {
    sequence = "())(("

    testAgainst(false)
  }

  @Test
  def test10(): Unit = {
    sequence = "(((())))()"

    testAgainst(true)
  }
  
}
