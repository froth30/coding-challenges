package com.codesignal

/** CodeSignal Challenge `dotProduct`
  *
  * @author froth30
  * @since  Oct 24, 2019
  */
object dotProduct {

  def dotProduct(v: Seq[Int]*) =
    v(0) zip v(1) map (p => p._1 * p._2) sum

}
