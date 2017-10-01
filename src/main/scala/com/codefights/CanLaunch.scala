package com.codefights

/**
  * CodeFights Challenge `canLaunch`
  *
  * @since  Sep 30, 2017
  * @author froth30
  */
object CanLaunch {
    
    /**
      * Determines whether it is possible for your friend, Kal, to launch missiles at the squadron
      * of alien ships, approaching in their favorite attack formation, <b><i>i-cragntbany</i></b>.
      *
      * @param n  The number of alien ships in the incoming attack squadron
      *           <ul><i>Guaranteed constraints:</i> &#9 `1 ≤ n ≤ 10`^`9`^
      * @return   `true` if the number of incoming alien ships is a <i>pentagonal number;</i>
      *           `false` otherwise.
      */
    def canLaunch(n: Int) =
        
        math.sqrt(24 * n + 1) % 6 == 5
    
}
