package com.codesignal

/** CodeFights Challenge `sumBelowBound`
  *
  * @author froth30
  * @since  Dec 29, 2017
  */
object sumBelowBound {

  /** Given an integer `bound`, finds the maximal integer `n` such that `1 + 2 + ... + n ≤ bound`.
    *
    * @example  <br>For `bound = 14`, the output should be `sumBelowBound(bound) = 4`.
    * @param b  The integer `bound`
    *           <ul>''Guaranteed constraints:'' &#9 `1 ≤ bound ≤ 5000`
    * @return   The maximal integer `n` such that `1 + 2 + ... + n ≤ bound`.
    */
  def sumBelowBound(b: Int) = (math sqrt 1 + 8 * b) / 2 - .5 toInt

}
