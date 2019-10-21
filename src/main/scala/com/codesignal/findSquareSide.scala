package com.codesignal

/** CodeSignal Challenge `findSquareSide`
  *
  * @author froth30
  * @since  Oct 18, 2019
  */
object findSquareSide {

  def s(n: Int) = n * n

  def findSquareSide(x: Seq[Int], y: Seq[Int]) =
    s(x(2) - x(1)) + s(y(2) - y(1))

}
