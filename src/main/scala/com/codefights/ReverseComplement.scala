package com.codefights

/** CodeFights Challenge `ReverseComplement`
  * 
  * @author froth30
  * @since  Nov 09, 2017
  */
object ReverseComplement {
    
    /** Finds the complement of a given strand of DNA.
      *
      * @param s  A strand of DNA
      * @return   The complement of strand `s`, in reverse order.
      */
    def ReverseComplement(s: String) = s
        .toUpperCase
        .replace('C', 'g')
        .replace('G', 'C')
        .replace('A', 't')
        .replace('T', 'A')
        .toUpperCase() reverse
    
}
