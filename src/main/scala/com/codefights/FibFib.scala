package com.codefights

/**
  * CodeFights Challenge `fibFib`, a __reverse challenge__!
  *
  * @since  Sep 29, 2017
  * @author froth30
  */
object FibFib {
    
    //TODO: See below...
    /**
      * TODO: ____
      *
      * @param f  TODO: ____  <ul><i>Guaranteed constraints:</i> &#9 `0 ≤ ff ≤ 10`^`8`^
      * @return   `true` if the integer is the square of a Fibonacci Number; `false` otherwise.
      *           TODO: Verify this!
      */
    def fibFib(f: Int, a: Int = 0, b: Int = 1): Any =
    {
        val r = math sqrt f
        
        if (f > 1)
            if (r < a + b)  fibFib(f, b, a + b)
            else            r == a + b
        else true
    }
    
}
