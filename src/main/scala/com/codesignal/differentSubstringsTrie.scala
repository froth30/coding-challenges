package com.codesignal

/** CodeSignal Challenge `differentSubstringsTrie`
  *
  * @author froth30
  * @since  Oct 11, 2019
  */
object differentSubstringsTrie {

  def differentSubstringsTrie(s: String) =
    1 to s.size map (n =>
      (s sliding n toSeq).distinct size) sum

}
