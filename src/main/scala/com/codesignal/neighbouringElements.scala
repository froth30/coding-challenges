package com.codesignal

/** CodeSignal Challenge `neighbouringElements`
  *
  * @author froth30
  * @since  Oct 13, 2019
  */
object neighbouringElements {

  type M = Array[Array[Int]]

  def neighbouringElements(m: M) =
    f(m) + f(m transpose)

  def f(m: M) =
    m map (r =>
      r sliding 2 count (p =>
        p(0) == p(1))) sum

}
