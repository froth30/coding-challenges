package com.codesignal

import org.junit.Test

/** Test class for CodeSignal Challenge `chessKnight`
  * 
  * @author froth30
  * @since  Aug 29, 2019
  */
class chessKnight_Test {
  
  import chessKnight._
  
  var cell = ""

  @throws[AssertionError]
  def testAgainst(expectedOutput: Int): Unit = {
    val output = chessKnight(cell)

    println()
    println(s"Input:              cell: $cell")
    println(s"Output:             $output")
    println(s"Expected Output:    $expectedOutput")

    assert(output == expectedOutput)
  }

  @Test
  def test01(): Unit = {
    cell = "a1"

    testAgainst(2)
  }

  @Test
  def test02(): Unit = {
    cell = "c2"

    testAgainst(6)
  }

  @Test
  def test03(): Unit = {
    cell = "d4"

    testAgainst(8)
  }

  @Test
  def test04(): Unit = {
    cell = "g6"

    testAgainst(6)
  }

  @Test
  def test05(): Unit = {
    cell = "a3"
    
    testAgainst(4)
  }

  @Test
  def test06(): Unit = {
    cell = "b7"

    testAgainst(4)
  }

  @Test
  def test07(): Unit = {
    cell = "h8"

    testAgainst(2)
  }

  @Test
  def test08(): Unit = {
    cell = "h6"

    testAgainst(4)
  }

  @Test
  def test09(): Unit = {
    cell = "g8"

    testAgainst(3)
  }

  @Test
  def test10(): Unit = {
    cell = "a5"

    testAgainst(4)
  }
  
}
