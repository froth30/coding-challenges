package com.codefights

/** CodeFights Challenge `listWithoutLoop`
  * 
  * @author froth30
  * @since  Nov 11, 2017
  */
object listWithoutLoop {
    
    type A = Array[Int]
    
    def listWithoutLoop(n: Int) = r(Array(), n)
    
    def r(a: A, n: Int): A = {
        if (n < 1)  (a :+ n) ++ (a reverse)
        else        r(a:+n, n-5)
    }
    
}
