package com.codesignal

/** CodeFights Challenge `factorialsProductTrailingZeros`
  * 
  * @author froth30
  * @since  Nov 18, 2017
  */
object factorialsProductTrailingZeros {
    
    /** Finds the number of trailing zeros in the decimal representation of
      * <p>
      *     `l! * (l + 1)! * ... * r!`
      * </p>
      *
      * @param l  The left (lower) bound of the range
      *           <ul>''Guaranteed constraints: '' &#9 `4 ≤ l ≤ r`
      * @param r  The right (upper) bound of the range
      *           <ul>''Guaranteed constraints: '' &#9 `l ≤ r ≤ 35`
      * @return   The number of trailing zeros in the result.
      */
    def factorialsProductTrailingZeros(l: Int, r: Int) =
        l to r map (x => x/5 + x/25) sum
    
}
