package com.codesignal

/**
  * CodeFights Challenge `gold`
  *
  * @since Jul 26, 2017
  * @author froth30
  */
object gold {
    
    def gold(n: Int) =
        2 to n/2 count(k => p(k) & p(n-k))
    
    def p(n: Int) =
        2 to n/2 forall (n % _ > 0)
    
}
