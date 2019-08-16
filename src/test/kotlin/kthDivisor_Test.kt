import org.junit.Test

class kthDivisor_Test() {

    private var n = 0
    private var k = 0

    fun testAgainst(expectedOutput: Int) {
        val output = kthDivisor(n, k)

        println()
        println("Input:                  n: $n")
        println("                        k: $k")
        println("Output:                 $output")
        println("Expected Output:        $expectedOutput")

        assert(output == expectedOutput)
    }

    @Test
    fun test1() {
        n = 63
        k = 4

        testAgainst(9)
    }

    @Test
    fun test2() {
        n = 5
        k = 3

        testAgainst(-1)
    }

    @Test
    fun test3() {
        n = 100
        k = 10

        testAgainst(-1)
    }

    @Test
    fun test4() {
        n = 16
        k = 5

        testAgainst(16)
    }

    @Test
    fun test5() {
        n = 239
        k = 3

        testAgainst(-1)
    }

}
