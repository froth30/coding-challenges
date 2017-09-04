package com.codefights

/**
  * CodeFights Challenge `booze`
  *
  * @since Sep 3, 2017
  * @author froth30
  */
object Booze {
    
    /**
      * Determines the most a person can drink and still be ok to drive to work.
      *
      * @param h the number of hours until the person has to leave for work
      * @param d the amount by which the person's BAC decreases per hour
      * @param i the amount by which the person's BAC increases per serving of their favorite drink
      * @return how much the person can drink, such that their BAC will be at most 0.08 when they have to leave for work
      */
    def booze(h: Int, d: Double, i: Double) = {
    
        /*
        
        1)  n * i = a
            h * d = b
            a - b = 0.08
        
        2)  a = 0.08 + b
        
        3)  n * i = 0.08 + h * d
        
        4)  n = (0.08 + h * d) / i
        
        5)  Prevent death!
        
        */
    
        val n = (h * d + .08) / i
        val m =          .45  / i
    
        if (n > m) m else n
        
    } toInt
    
}
