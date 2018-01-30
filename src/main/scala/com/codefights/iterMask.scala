package com.codefights

/** CodeFights Challenge `iterMask`
  *
  * @author froth30
  * @since  Jan 29, 2018
  */
object iterMask {

  def iterMask(n: Int) = n to 0 by -1 filter (i => (n & i) == i) toArray

}
