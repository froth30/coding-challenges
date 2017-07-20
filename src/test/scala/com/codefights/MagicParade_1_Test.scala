package com.codefights

import org.junit.Test

/**
  * Tests for CodeFights Challenge `magicParade_1`
  *
  * @since Jul 20, 2017
  * @author froth30
  */
//noinspection SimplifyBoolean
class MagicParade_1_Test {
    
    import MagicParade_1._
    
    @Test
    def test1(): Unit = assert(magicParade_1(1, 0, 2) == false)
    
    @Test
    def test2(): Unit = assert(magicParade_1(1, 0, 1) == true)
    
    @Test
    def test3(): Unit = assert(magicParade_1(0, 4, 2) == true)
    
    @Test
    def test4(): Unit = assert(magicParade_1(0, 5, 1) == false)
    
    @Test
    def test5(): Unit = assert(magicParade_1(1, 5, 1) == true)
    
    @Test
    def test6(): Unit = assert(magicParade_1(0, 0, 0) == false)
    
    @Test
    def test7(): Unit = assert(magicParade_1(5, 25, 4) == true)
    
    @Test
    def test8(): Unit = assert(magicParade_1(20, 20, 22) == false)
    
    @Test
    def test9(): Unit = assert(magicParade_1(100000000, 100000000, 100000000) == true)
    
    @Test
    def test10(): Unit = assert(magicParade_1(5, 38, 10) == false)
    
    @Test
    def test11(): Unit = assert(magicParade_1(3, 21, 5) == true)
    
    @Test
    def test12(): Unit = assert(magicParade_1(0, 0, 1) == true)
    
    @Test
    def test13(): Unit = assert(magicParade_1(10000000, 100000000, 10000000) == false)
    
    @Test
    def test14(): Unit = assert(magicParade_1(10000000, 10000000, 100000000) == false)
    
    @Test
    def test15(): Unit = assert(magicParade_1(10000000, 50000000, 10000000) == true)
    
}
