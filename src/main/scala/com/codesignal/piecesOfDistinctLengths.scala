package com.codesignal

/** CodeSignal Challenge `piecesOfDistinctLengths`
  *
  * @author froth30
  * @since  Oct 18, 2019
  */
object piecesOfDistinctLengths {

  def piecesOfDistinctLengths(n: Int) =
    1 to n indexWhere (k =>
      (k + 1) * k / 2d > n)

}
