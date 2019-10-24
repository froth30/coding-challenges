package com.codesignal

/** CodeSignal Challenge `deleteDigit`
  *
  * @author froth30
  * @since  Oct 23, 2019
  */
object deleteDigit {

  def deleteDigit(n: Int) = {
    val s = n + ""
    0 to s.size-1 map { i =>
      (s take i) + (s drop i+1) toInt
    } max
  }

}
