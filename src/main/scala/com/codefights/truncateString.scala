package com.codefights

/** CodeFights Challenge `truncateString`
  * 
  * @author froth30
  * @since  Oct 09, 2017
  */
object truncateString {
    
    type S = String
    
    /** @see [[t]] */
    def truncateString = t(_: S)
    
    /** For a given string, finds the result of applying the following operation to it:
      * <ul>
      *     <li>if the leftmost digit of the string is divisible by `3`, remove it from the string;
      *     <li>otherwise, if the rightmost digit of the string is divisible by `3`, remove it from
      *         the string;
      *     <li>otherwise, if the sum of two digits on the sides of the string is divisible by `3`,
      *         remove <i>both digits</i> from the string;
      * </ul>
      *
      * @param s  A string &#9 &#9 <i>Guaranteed constraints:</i> &#9 `1 ≤ s.length ≤ 15`
      * @return   The result of applying the algorithm to `s`, whereby the operation defined above
      *           is applied sequentially until `s` is either (1) empty or (2) none of the three
      *           given conditions are met.
      */
    def t(s: S): S = s match {
        case ""                            => s
        case s if  s(0)           % 3 < 1  => t(s drop 1)
        case s if         s.last  % 3 < 1  => t(s dropRight 1)
        case s if (s(0) + s.last) % 3 < 1  => t(s drop 1 dropRight 1)
        case _                             => s
    }
    
}
