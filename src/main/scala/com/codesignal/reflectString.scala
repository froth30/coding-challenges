package com.codesignal

/** CodeSignal Challenge `reflectString`
  *
  * @author froth30
  * @since  Oct 13, 2019
  */
object reflectString {

  def reflectString(s: String) =
    s map (c => 122 - (c - 97) % 26 toChar) mkString

}
