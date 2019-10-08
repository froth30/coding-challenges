package com.codesignal

/** CodeSignal Challenge `higherVersion`
  *
  * @author froth30
  * @since  Oct 07, 2019
  */
object higherVersion {

  type T = String

  def s = (_: T) split '.' map (_ toInt)

  def higherVersion(a: T, b: T) =
    (s(a) zip s(b) map (p => p._1 - p._2) find (_ != 0) getOrElse 0) > 0

}
