package com.codesignal

/** CodeSignal Challenge `primeFactors2`
  *
  * @author froth30
  * @since  Oct 14, 2019
  */
object primeFactors2 {

  def primeFactors2(n: Int) = {
    var k, f = n
    var s = Set[Int]()

    while (k > 1) {
      f = 2 to k find (f =>
        !(2 to f-1 exists (f % _ < 1))
          & k % f < 1) get

      s += f
      k /= f
    }

    s toArray
  }

}
