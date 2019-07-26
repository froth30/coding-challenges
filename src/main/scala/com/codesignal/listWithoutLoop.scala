package com.codesignal

/** CodeFights Challenge `listWithoutLoop`
  * 
  * @author froth30
  * @since  Nov 11, 2017
  */
object listWithoutLoop {
    
    def listWithoutLoop(n: Int) = {
        val r = n to -4 by -5
        r ++ (r.reverse tail) toArray
    }
    
}
