package com.codesignal

import org.junit.Test

class appleBoxes_Test() {

    private var k = 0

    fun testAgainst(expectedOutput: Int) {
        val output = appleBoxes(k)

        println()
        println("Input:                  k: $k")
        println("Output:                 $output")
        println("Expected Output:        $expectedOutput")

        assert(output == expectedOutput)
    }

    @Test
    fun test1() {
        k = 5

        testAgainst(-15)
    }

    @Test
    fun test2() {
        k = 15

        testAgainst(-120)
    }

    @Test
    fun test3() {
        k = 36

        testAgainst(666)
    }

    @Test
    fun test4() {
        k = 1

        testAgainst(-1)
    }

    @Test
    fun test5() {
        k = 14

        testAgainst(105)
    }

    @Test
    fun test6() {
        k = 12

        testAgainst(78)
    }

    @Test
    fun test7() {
        k = 9

        testAgainst(-45)
    }

    @Test
    fun test8() {
        k = 40

        testAgainst(820)
    }

    @Test
    fun test9() {
        k = 37

        testAgainst(-703)
    }

}
