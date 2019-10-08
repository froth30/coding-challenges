package com.codesignal

/** CodeSignal Challenge `evenNumbersBeforeFixed`
  *
  * @author froth30
  * @since  Oct 07, 2019
  */
object evenNumbersBeforeFixed {

  def evenNumbersBeforeFixed(s: Seq[Int], f: Int) = {
    var n = 0
    if (s exists (e => {
      if (e % 2 < 1 & e != f)
        n += 1
      e == f
    }))
      n
    else
      -1
  }

}
