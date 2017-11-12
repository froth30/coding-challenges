package com.codefights

/** CodeFights Challenge `listWithoutLoop`
  * 
  * @author froth30
  * @since  Nov 11, 2017
  */
object listWithoutLoop {
    
    type A = Array[Int]
    
    def listWithoutLoop = L(_: Int, Array())
    
    def L(n: Int, a: A): A =
        if (n < 1)  (a :+ n) ++ (a reverse)
        else        L(n-5, a:+n)
    
}
