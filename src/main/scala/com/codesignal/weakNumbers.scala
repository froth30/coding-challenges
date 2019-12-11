package com.codesignal

/** CodeSignal Challenge `weakNumbers`
  *
  * @author froth30
  * @since  Dec 10, 2019
  */
object weakNumbers {

  def weakNumbers(n: Int) = {
    val d = 1 to n map (x => 1 to x count (x % _ < 1))
    val w = 0 to n-1 map (i => d take i count (_ > d(i)))
    val W = w max

    Array(W, w count (_ == W))
  }

}
