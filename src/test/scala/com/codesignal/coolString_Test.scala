package com.codesignal

import org.junit.Test

/** Test class for CodeSignal Challenge `coolString_Test`
  * 
  * @author froth30
  * @since  Jul 26, 2019
  */
class coolString_Test {
    
    import coolString._
    
    var inputString = ""

    @throws[AssertionError]
    def testAgainst(expectedOutput: Boolean): Unit = {
        val output = coolString(inputString)

        println()
        println(s"Input:              inputString: $inputString")
        println(s"Output:             $output")
        println(s"Expected Output:    $expectedOutput")

        assert(output == expectedOutput)
    }

    @Test
    def test01(): Unit = {
        inputString = "aQwFdA"

        testAgainst(true)
    }

    @Test
    def test02(): Unit = {
        inputString = "aAA"

        testAgainst(false)
    }

    @Test
    def test03(): Unit = {
        inputString = "q q"

        testAgainst(false)
    }

    @Test
    def test04(): Unit = {
        inputString = "wWw1"

        testAgainst(false)
    }

    @Test
    def test05(): Unit = {
        inputString = "2"
        
        testAgainst(false)
    }

    @Test
    def test06(): Unit = {
        inputString = "aAaAaAa"

        testAgainst(true)
    }

    @Test
    def test07(): Unit = {
        inputString = "z"

        testAgainst(true)
    }

    @Test
    def test08(): Unit = {
        inputString = "_"

        testAgainst(false)
    }

    @Test
    def test09(): Unit = {
        inputString = "AaAaAaAaAA"

        testAgainst(false)
    }

    @Test
    def test10(): Unit = {
        inputString = "z2ZkLzZ"

        testAgainst(false)
    }
    
}
