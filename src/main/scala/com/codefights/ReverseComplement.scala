package com.codefights

/** CodeFights Challenge `ReverseComplement`
  * 
  * @author froth30
  * @since  Nov 09, 2017
  */
object ReverseComplement {
    
    /** Finds the reverse complement of a given strand of DNA.
      *
      * @return The complement of strand, in reverse order.
      */
    def ReverseComplement = (_: String)
        .toUpperCase map ("                                                                 T G   C      N    WA  S"(_)) reverse
    
}
