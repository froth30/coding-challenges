package com.codesignal

/** CodeFights Challenge `isDivisibleBy3`
  *
  * @author froth30
  * @since  Nov 22, 2017
  */
object isDivisibleBy6 {
    
    /** Given a ''masked number'', finds all the possible options to replace
      * the asterisk with a digit to produce an integer divisible by `6`.
      * <p>
      * A ''masked number'' is a string that consists of digits and one
      * asterisk (`*`) that should be replaced by exactly one digit.
      * <br>
      *
      * @param s  A ''masked number''
      *           <ul>''Guaranteed constraints:'' &#9 `1 ≤ s.length ≤ 10`^`5`^
      * @return   A sorted array of strings representing all non-negative
      *           integers that correspond to the given mask and are
      *           divisible by `6`.
      */
    def isDivisibleBy6(s: String) = 0 to 9 map(i =>
        s replace("*", "" + i)) filter(BigInt(_) % 6 < 1) toArray
    
}
