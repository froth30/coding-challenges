package com.codesignal

import org.junit.Test

/** Test class for CodeSignal Challenge `shapeArea`
  * 
  * @author froth30
  * @since  Aug 26, 2019
  */
class shapeArea_Test {
  
  import shapeArea._
  
  var n = 0

  @throws[AssertionError]
  def testAgainst(expectedOutput: Int): Unit = {
    val output = shapeArea(n)

    println()
    println(s"Input:              n: $n")
    println(s"Output:             $output")
    println(s"Expected Output:    $expectedOutput")

    assert(output == expectedOutput)
  }

  @Test
  def test01(): Unit = {
    n = 2

    testAgainst(5)
  }

  @Test
  def test02(): Unit = {
    n = 3

    testAgainst(13)
  }

  @Test
  def test03(): Unit = {
    n = 1

    testAgainst(1)
  }

  @Test
  def test04(): Unit = {
    n = 5

    testAgainst(41)
  }

  @Test
  def test05(): Unit = {
    n = 7000
    
    testAgainst(97986001)
  }

  @Test
  def test06(): Unit = {
    n = 8000

    testAgainst(127984001)
  }

  @Test
  def test07(): Unit = {
    n = 9999

    testAgainst(199940005)
  }

  @Test
  def test08(): Unit = {
    n = 9998

    testAgainst(199900013)
  }

  @Test
  def test09(): Unit = {
    n = 8999

    testAgainst(161946005)
  }

  @Test
  def test10(): Unit = {
    n = 100

    testAgainst(19801)
  }
  
}
