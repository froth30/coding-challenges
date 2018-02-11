package com.codefights

/** CodeFights Challenge `mSquare`
  *
  * @author froth30
  * @since  Feb 10, 2018
  */
object mSquare {

  def mSquare(n: Int): Int = {
    if (n < 4)
      n
    else {
      var r = n
      var k = 1
      def s = k * k
      while (k <= n & s <= n) {
        r = math min(r, 1 + mSquare(n - s))
        k += 1
      }
      r
    }
  }

}
