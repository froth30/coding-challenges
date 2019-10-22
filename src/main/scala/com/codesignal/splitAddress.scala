package com.codesignal

/** CodeSignal Challenge `splitAddress`
  *
  * @author froth30
  * @since  Oct 21, 2019
  */
object splitAddress {

  def splitAddress(a: String) = {
    val p = a split "://"
    val d = p(1) split ".com"
    if (d.size > 1)
      Array(p(0), d(0), d(1) tail)
    else
      Array(p(0), d(0))
  }

}
