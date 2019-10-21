package com.codesignal

/** CodeSignal Challenge `findSquareSide`
  *
  * @author froth30
  * @since  Oct 18, 2019
  */
object findSquareSide {

  type V = Seq[Int]

  def s(n: Int) = n * n

  def findSquareSide(x: V, y: V) =
    1 to 3 map (i => s(x(i) - x(0)) + s(y(i) - y(0))) min

}
