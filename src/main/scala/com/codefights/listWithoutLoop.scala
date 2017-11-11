package com.codefights

/** CodeFights Challenge `listWithoutLoop`
  * 
  * @author froth30
  * @since  Nov 11, 2017
  */
object listWithoutLoop {
    
    type A = Array[Int]
    
    def listWithoutLoop(n: Int, a: A = Array()): A =
        if (n < 1)  (a :+ n) ++ (a reverse)
        else        listWithoutLoop(n-5, a:+n)
    
}
