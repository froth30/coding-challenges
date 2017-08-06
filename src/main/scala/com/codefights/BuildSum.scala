package com.codefights

/**
  * CodeFights Challenge `buildSum`
  *
  * @since Aug 6, 2017
  * @author froth30
  */
object BuildSum {
    
    def buildSum(n: Int): Double =
        if (n > 0)
            math.pow(n, n) + buildSum(n-1)
        else 1
    
}
