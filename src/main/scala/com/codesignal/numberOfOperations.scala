package com.codesignal

/** CodeSignal Challenge `numberOfOperations`
  *
  * @author froth30
  * @since  Dec 11, 2019
  */
object numberOfOperations {

  def numberOfOperations(v: Int*) = {
    var a, b, c, n = 0

    a = v max

    b = v min

    while (a % b < 1) {
      a /= b

      if (a < b) {
        c = a
        a = b
        b = c
      }

      n += 1
    }

    n
  }

}
