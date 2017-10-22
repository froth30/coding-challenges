package com.codefights

/** CodeFights Challenge `checkEqualFrequency`
  * 
  * @author froth30
  * @since  Oct 22, 2017
  */
object checkEqualFrequency {
    
    /** Checks whether each integer in the given array is contained the same
      * number of times as every other integer.
      *
      * @param a  An array of integers
      *           <ul>''Guaranteed constraints:''&#9`1 ≤ a.length ≤ 5 ·10`^`4`^
      *                                   <br>&#9&#9`1 ≤ a[i] ≤ 4 · 10`^`8`^
      * @return   `true` if each unique integer is contained the same number
      *           of times; `false` otherwise.
      */
    def checkEqualFrequency(a: Array[Int]) = f(a sorted)
    
    def f(a: Array[Int], n: Int = 0): Boolean = {
        a.isEmpty || {
            val p = a prefixLength(_ == a(0))
            
            if (n < 1)  f(a, p)
            else        p == n && f(a drop p, n)
        }
    }
    
}
