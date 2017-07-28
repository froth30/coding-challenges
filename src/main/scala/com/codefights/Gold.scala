package com.codefights

/**
  * CodeFights Challenge `gold`
  *
  * @since Jul 28, 2017
  * @author froth30
  */
object Gold {
    
    def gold(n: Int) =
        2 to n/2 map(k =>
            if (p(k) & p(n-k)) 1
            else 0
        ) sum
    
    def p(n: Int) = ! (2 to n-2 exists (n % _ == 0))
    
}
