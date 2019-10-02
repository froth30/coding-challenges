package com.codesignal

/** CodeSignal Challenge `candles`
  *
  * @author froth30
  * @since  Oct 01, 2019
  */
object candles {

  def candles(n: Int, p: Int, r: Int = 0): Int =
    if (n + r / p < 1) 0
    else n + candles(r / p, p, n + r % p)

}
