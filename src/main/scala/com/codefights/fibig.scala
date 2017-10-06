package com.codefights

/** CodeFights Challenge `fibig`, meant to be a __reverse challenge__...
  * 
  * @author froth30
  * @since  Oct 05, 2017
  */
object fibig {
    
    def ^ : (Int, Int) => Int = math.pow(_,_) toInt
    def ■ : (Int) => Int = ^(_,2)
    def █ : (Int) => Int = ^(_,3)
    
    /** Finds the `n`^th^ Fibonacci number modulo `10`^`9`^`+7`, given some <i>really huge</i>
      * number `n`.
      *
      * @param n  A hexadecimal number (as a string), corresponding to the `n`^th^ Fibonacci number
      *           <ul><i>Guaranteed constraints:</i> &#9 `1 ≤ n.length ≤ 1000`
      * @return   The `n`^th^ Fibonacci number modulo `10`^`9`^`+7`, expressed as an integer in
      *           decimal notation.
      */
    def fibig(n: String) = F(BigInt(n,16))
    
    def F(n: BigInt): Int = {
        if (n > 1) {
            if (n % 4 < 1)
                n / 4 match { case n =>
                    4 * F(n) * F(n+1) * (■(F(n+1)) + 2 * ■(F(n)))
                    - 3 * ■(F(n)) * (■(F(n)) + 2 * ■(F(n+1)))
                }
            else {
                val m = n % 3
                n / 3 match { case n =>
                    m toInt match {
                        case 0 => 5 * █(F(n)) + 3 * ^(-1, n toInt) * F(n)
                        case 1 => █(F(n+1)) + 3 * F(n+1) * ■(F(n)) - █(F(n))
                        case 2 => █(F(n+1)) + 3 * ■(F(n+1)) * F(n) + █(F(n))
                    }
                }
            }
        }
        else n toInt
    } % 1000000007
    
}
