package com.codefights

/**
  * CodeFights Challenge `raiseIt`
  *
  * @since Jul 26, 2017
  * @author froth30
  */
object RaiseIt {
    
    def raiseIt(a: Array[Int]) = a
        .map(n => math pow(n / 10, n % 10))
        .sum
    
}
