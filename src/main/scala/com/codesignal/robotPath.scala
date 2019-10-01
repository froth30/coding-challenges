package com.codesignal

/** CodeSignal Challenge `robotPath`
  *
  * @author froth30
  * @since  Sep 30, 2019
  */
object robotPath {

  def robotPath(s: String, b: Int) = {
    var (x, y) = (0, 0)
    for (i <- s)
           if (i < 69)  y = y - 1 max -b  // D
      else if (i > 84)  y = y + 1 min  b  // U
      else if (i < 77)  x = x - 1 max -b  // L
      else              x = x + 1 min  b  // R

    Array(x, y)
  }

}
