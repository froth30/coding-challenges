package com.codefights

/** CodeFights Challenge `isPangram`
  * 
  * @author froth30
  * @since  Nov 25, 2017
  */
object isPangram {
    
    /** Determines whether the given string is a pangram or not.
      *
      * @param s  A string containing characters with their ASCII-codes in
      *           the range `[32, 126]`
      *           <ul>''Guaranteed constraints:'' &#9 `1 ≤ s.length ≤ 100`
      * @return   `true` if `s` is a pangram; `false` otherwise.
      */
    def isPangram(s: String) = 65 to 90 forall (s.toUpperCase contains _)
    
}
