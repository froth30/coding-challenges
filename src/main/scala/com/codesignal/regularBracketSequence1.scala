package com.codesignal

/** CodeSignal Challenge `regularBracketSequence1`
  *
  * @author froth30
  * @since  Aug 25, 2019
  */
object regularBracketSequence1 {

  def regularBracketSequence1(s: String): Boolean = {
    var d = 0
    for (c <- s) {
      d += 81 - c * 2
      if (d < 0)
        return false
    }

    d < 1
  }

}
