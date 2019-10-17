package com.codesignal

/** CodeSignal Challenge `primeFactors2`
  *
  * @author froth30
  * @since  Oct 14, 2019
  */
object primeFactors2 {

  def primeFactors2(n: Int) = {
    var k = n
    var r, f = 1
    var s = Set(0) - 0

    while (k > 1) {
      r = math sqrt k toInt

      f = f+1 to r find (k % _ < 1) getOrElse k

      while (k % f < 1)
        k /= f

      s += f
    }

    s toArray
  }

}
