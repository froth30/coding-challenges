package com.codefights

/** CodeFights Challenge `isPangram`
  * 
  * @author froth30
  * @since  Nov 25, 2017
  */
object isPangram {
    
    def isPangram(s: String) = 65 to 90 forall (s.toUpperCase contains _)
    
}
