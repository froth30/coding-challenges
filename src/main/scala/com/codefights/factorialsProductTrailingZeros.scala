package com.codefights

/** CodeFights Challenge `factorialsProductTrailingZeros`
  * 
  * @author froth30
  * @since  Nov 18, 2017
  */
object factorialsProductTrailingZeros {
    
    def factorialsProductTrailingZeros(l: Int, r: Int) =
        l to r map (x => x/5 + x/25) sum
    
}
