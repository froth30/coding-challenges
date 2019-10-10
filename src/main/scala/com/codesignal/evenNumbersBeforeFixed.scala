package com.codesignal

/** CodeSignal Challenge `evenNumbersBeforeFixed`
  *
  * @author froth30
  * @since  Oct 07, 2019
  */
object evenNumbersBeforeFixed {

  def evenNumbersBeforeFixed(s: Seq[Int], f: Int) =
    s filter (i => i % 2 < 1 | i == f) indexOf f

}
