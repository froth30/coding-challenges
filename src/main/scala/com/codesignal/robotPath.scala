package com.codesignal

/** CodeSignal Challenge `robotPath`
  *
  * @author froth30
  * @since  Sep 30, 2019
  */
object robotPath {

  def robotPath(s: String, b: Int) = {
    var (x, y) = (0, 0)
    for (c <- s)
      if (c % 6 > 3)  x = x + c %  4 - 1 min b max -b  // L or R
      else            y = y + c % 15 - 9 min b max -b  // U or D

    Array(x, y)
  }

}
