package com

import org.junit.Test

/**
  * Created by froth30 on 7/10/2017.
  */
abstract class TestBase[T] {
    
    def testAgainst(expectedOutput: T): Unit
    
    private def testAgainst(expectedOutput: Array[Int]): Unit = {
    
    }
    
    @Test
    def test1(): Unit
    
    @Test
    def test2(): Unit
    
    @Test
    def test3(): Unit
    
}
