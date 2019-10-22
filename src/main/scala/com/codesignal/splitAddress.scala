package com.codesignal

/** CodeSignal Challenge `splitAddress`
  *
  * @author froth30
  * @since  Oct 21, 2019
  */
object splitAddress {

  def splitAddress =
    (_: String) split "://" flatMap (_ split ".com") flatMap (_ split "/") filterNot (_ isEmpty)

}
