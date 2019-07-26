package com.codesignal

/**
  * CodeFights Challenge `longMultiplication`
  *
  * @since  Sep 27, 2017
  * @author froth30
  */
object longMultiplication {
    
    type S = String
    type I = Int
    
    /**
      * Multiplies two integers the good old-fashioned way.<br>
      * <i>However</i>, instead of returning the product, this method returns the number of
      * <b>carry operations</b>.
      *
      * @param a  The first number.   <ul><i>Guaranteed constraints:</i> `1 ≤ a.length < 850`
      * @param b  The second number.  <ul><i>Guaranteed constraints:</i> `1 ≤ b.length < 850`
      * @return   The number of carry operations performed while multiplying `a` by `b`.
      */
    def longMultiplication(a: S, b: S): I = {
        m(a toInt, b toInt, 0)
    }
    
    def m(a: I, b: I, c: I): I = {
        val u = a * b % 10
        
        
        ???
    }
    
}
