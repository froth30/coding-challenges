package com.codefights

/** CodeFights Challenge `isDivisibleBy3`
  * 
  * @author froth30
  * @since  Nov 21, 2017
  */
object isDivisibleBy3 {
    
    def isDivisibleBy3(s: String) = 0 to 9 map(i =>
        s replace("*", "" + i)) filter(BigInt(_) % 3 < 1) toArray
    
}
