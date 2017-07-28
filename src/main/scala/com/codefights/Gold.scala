package com.codefights

/**
  * CodeFights Challenge `gold`
  *
  * @since Jul 28, 2017
  * @author froth30
  */
object Gold {
    
    def gold(n: Int) =
        2 to n/2 count(k => p(k) & p(n-k))
    
    def p(n: Int) =
        2 to n/2 forall (n % _ > 0)
    
}
