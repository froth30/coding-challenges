package com.codesignal

/** CodeSignal Challenge `minimalMultiple`
  *
  * @author froth30
  * @since  Oct 12, 2019
  */
object minimalMultiple {

  def minimalMultiple(d: Int, n: Int) =
    n - 1 + d - (n - 1) % d

}
