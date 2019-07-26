package com.codesignal

/**
  * CodeFights Challenge `booze`
  *
  * @since Sep 3, 2017
  * @author froth30
  */
object booze {
    
    /**
      * Determines the most a person can drink and still be ok to drive to work.
      *
      * @param h the number of hours until the person has to leave for work
      * @param d the amount by which the person's BAC decreases per hour
      * @param i the amount by which the person's BAC increases per serving of their favorite drink
      * @return how much the person can drink, such that their BAC will be at most 0.08 when they have to leave for work
      */
    def booze(h: Int, d: Double, i: Double) = {
    
        math min(
            .08 + h * d,
            .45
        )
        
    } / i toInt
    
}
