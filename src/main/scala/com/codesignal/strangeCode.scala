package com.codesignal

/** CodeSignal Challenge `strangeCode`
  *
  * @author froth30
  * @since  Oct 11, 2019
  */
object strangeCode {

  def strangeCode(s: Int, e: Int) =
    "ab" * 9 take (e - s) / 2

}
