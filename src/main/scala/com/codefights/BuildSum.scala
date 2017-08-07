package com.codefights

/**
  * CodeFights Challenge `buildSum`
  *
  * @since Aug 6, 2017
  * @author froth30
  */
object BuildSum {
    
    def buildSum(n: Int) = 0 to n map(i => math pow(i,i)) sum
    
}
