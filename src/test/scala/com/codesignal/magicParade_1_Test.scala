package com.codesignal

import org.junit.Test

/**
  * Tests for CodeFights Challenge `magicParade_1`
  *
  * @since Jul 20, 2017
  * @author froth30
  */
//noinspection SimplifyBoolean
class magicParade_1_Test {
    
    import magicParade_1._
    
    @Test(timeout = 20000)
    def test01(): Unit = assert(magicParade_1(1, 0, 2) == false)
    
    @Test(timeout = 20000)
    def test02(): Unit = assert(magicParade_1(1, 0, 1) == true)
    
    @Test(timeout = 20000)
    def test03(): Unit = assert(magicParade_1(0, 4, 2) == true)
    
    @Test(timeout = 20000)
    def test04(): Unit = assert(magicParade_1(0, 5, 1) == false)
    
    @Test(timeout = 20000)
    def test05(): Unit = assert(magicParade_1(1, 5, 1) == true)
    
    @Test(timeout = 20000)
    def test06(): Unit = assert(magicParade_1(0, 0, 0) == false)
    
    @Test(timeout = 20000)
    def test07(): Unit = assert(magicParade_1(5, 25, 4) == true)
    
    @Test(timeout = 20000)
    def test08(): Unit = assert(magicParade_1(20, 20, 22) == false)
    
    @Test(timeout = 20000)
    def test09(): Unit = assert(magicParade_1(100000000, 100000000, 100000000) == true)
    
    @Test(timeout = 20000)
    def test10(): Unit = assert(magicParade_1(5, 38, 10) == false)
    
    @Test(timeout = 20000)
    def test11(): Unit = assert(magicParade_1(3, 21, 5) == true)
    
    @Test(timeout = 20000)
    def test12(): Unit = assert(magicParade_1(0, 0, 1) == true)
    
    @Test(timeout = 20000)
    def test13(): Unit = assert(magicParade_1(10000000, 100000000, 10000000) == false)
    
    @Test(timeout = 20000)
    def test14(): Unit = assert(magicParade_1(10000000, 10000000, 100000000) == false)
    
    @Test(timeout = 20000)
    def test15(): Unit = assert(magicParade_1(10000000, 50000000, 10000000) == true)
    
}
