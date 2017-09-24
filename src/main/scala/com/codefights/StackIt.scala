package com.codefights

/**
  * CodeFights Challenge `stackIt`
  *
  * @since  Sep 23, 2017
  * @author froth30
  */
object StackIt {
    
    /**
      * Determines whether it is possible to stack a given number of packs of XYZ soda in a perfect
      * triangular structure.
      *
      * @param p  The number of XYZ soda packs in stock
      *           <br><i>Guaranteed constraints:</i>
      *           <br>`0 ≤ packs < 10^12`
      * @param n  The current level of XYZ stock (from the top of the structure) to verify exist
      * @return   `true` if it is possible to stack `p` packs in a perfect triangular structure;
      *           `false` if it is not possible.
      */
    def stackIt(p: Long, n: Int = 1): Any =
        if (p < 1)  p == 0
        else        stackIt(p-n, n+1)
    
}
