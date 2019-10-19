package com.codesignal

/** CodeSignal Challenge `findSquareSide`
  *
  * @author froth30
  * @since  Oct 18, 2019
  */
object findSquareSide {

  def s = math pow (_: Double, 2) toInt

  def findSquareSide(x: Seq[Int], y: Seq[Int]) =
    1 to 3 map (i => s(x(i) - x(0)) + s(y(i) - y(0))) min

}
