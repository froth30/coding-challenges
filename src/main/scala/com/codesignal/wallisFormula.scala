package com.codesignal

/**
  * CodeFights Challenge `wallisFormula`
  *
  * @since  Sep 16, 2017
  * @author froth30
  */
object wallisFormula {
    
    /**
      * Calculates the value of the integrated function `sin` or `cos` using Wallis' formula.
      * <br><i>
      *     It doesn't depend on whether the function is `sin` or `cos`;
      *     it depends on the power of the function only.
      * </i></br>
      *
      * @param n  The power of the `sin` or `cos` function.
      *           <i>Guaranteed constraints: 2 < `n` < 35</i>
      * @return   The value of the integrated function within the bounds of `π/2` to `0`.
      */
    def wallisFormula(n: Int): Double =
        if (n < 4)
            if (n == 2)
                math.Pi / 4
            else
                2 / 3d
        else
            wallisFormula(n - 2) * (n - 1) / n
    
}
