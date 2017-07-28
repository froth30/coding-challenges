package com.codefights

/**
  * CodeFights Challenge `gold`
  *
  * @since Jul 28, 2017
  * @author froth30
  */
object Gold {
    
    def gold(n: Int): Int = {
        (2 to n/2).map(k =>
            if (isPrime(k) && isPrime(n-k)) 1
            else 0
        ).sum
    }
    
    def isPrime(n: Int): Boolean =
        ! ((2 to n-2) exists (n % _ == 0))
    
}
