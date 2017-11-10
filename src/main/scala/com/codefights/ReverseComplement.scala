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
    def ReverseComplement(s: String) = s.reverseMap {
        case  65 |  97  => "T"  // A
        case  67 |  99  => "G"  // C
        case  71 | 103  => "C"  // G
        case  84 | 116  => "A"  // T
        case     _      => "N"  // N
    } mkString
    
}
