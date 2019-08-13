package com.codesignal

import org.junit.Test

/** Test class for CodeSignal Challenge `fastSymmetrization`
  * 
  * @author froth30
  * @since  Aug 13, 2019
  */
class fastSymmetrization_Test {
    
    import fastSymmetrization._
    
    var input = Array(Array('*'))

    def stringFrom(a: Array[Char]): String = {
        val str =
            if (a isEmpty)  ""
            else  a.mkString(",")

        s"[$str]"
    }

    def stringFrom(a: Array[Array[Char]]): String = {
        val str =
            if (a isEmpty)  ""
            else  a.map(stringFrom).mkString(",\n                     ")

        s"[$str]"
    }

    def array1DFrom(s: String): Array[Char] = {
        s.trim.drop(1).split(",").map(_.trim()(1))
    }

    def array2DFrom(s: String): Array[Array[Char]] = {
        s.trim.drop(1).split("\n").map(array1DFrom)
    }

    @throws[AssertionError]
    def testAgainst(expectedOutput: Array[Array[Char]]): Unit = {
        val inputString = stringFrom(input)
        val output = fastSymmetrization(input)

        println()
        println(s"Input:              a: $inputString")
        println(s"Output:             ${stringFrom(output)}")
        println(s"Expected Output:    ${stringFrom(expectedOutput)}")
        
        assert(output.size == expectedOutput.size)
        assert(output.indices.forall(i => output(i) sameElements expectedOutput(i)))
    }
    
    @Test
    def test1(): Unit = {
        input = array2DFrom("[[\"*\",\"*\",\"c\",\"*\"], \n [\"*\",\"b\",\"*\",\"a\"], \n [\"a\",\"*\",\"*\",\"*\"], \n [\"*\",\"*\",\"c\",\"*\"]]")

        testAgainst(array2DFrom("[[\"*\",\"c\",\"c\",\"*\"], \n [\"a\",\"b\",\"b\",\"a\"], \n [\"a\",\"b\",\"b\",\"a\"], \n [\"*\",\"c\",\"c\",\"*\"]]"))
    }
    
    @Test
    def test2(): Unit = {
        input = array2DFrom("[[\"*\",\"a\",\"b\",\"*\"], \n [\"*\",\"a\",\"b\",\"*\"]]")
        
        testAgainst(Array())
    }
    
    @Test
    def test3(): Unit = {
        input = array2DFrom("[[\"*\",\"*\"], \n [\"*\",\"*\"]]")
        
        testAgainst(array2DFrom("[[\"*\",\"*\"], \n [\"*\",\"*\"]]"))
    }
    
    @Test
    def test4(): Unit = {
        input = array2DFrom("[[\"*\",\"a\"], \n [\"b\",\"*\"]]")
        
        testAgainst(Array())
    }
    
    @Test
    def test5(): Unit = {
        input = array2DFrom("[[\"a\",\"*\"], \n [\"*\",\"a\"]]")
        
        testAgainst(array2DFrom("[[\"a\",\"a\"], \n [\"a\",\"a\"]]"))
    }

    @Test
    def test6(): Unit = {
        input = array2DFrom("[[\"*\",\"*\"], \n [\"*\",\"x\"], \n [\"*\",\"*\"], \n [\"*\",\"*\"]]")

        testAgainst(array2DFrom("[[\"*\",\"*\"], \n [\"x\",\"x\"], \n [\"x\",\"x\"], \n [\"*\",\"*\"]]"))
    }
    
}
