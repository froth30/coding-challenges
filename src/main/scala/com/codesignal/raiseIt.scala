package com.codesignal

/**
  * CodeFights Challenge `raiseIt`
  *
  * @since Jul 26, 2017
  * @author froth30
  */
object raiseIt {
    
    def raiseIt(a: Array[Int]) = a
        .map(n => math pow(n / 10, n % 10))
        .sum
    
}
