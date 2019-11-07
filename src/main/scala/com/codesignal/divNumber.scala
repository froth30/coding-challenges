package com.codesignal

/** CodeSignal Challenge `divNumber`
  *
  * @author froth30
  * @since  Nov 06, 2019
  */
object divNumber {

  def divNumber(p: Int*) =
    p(1) to p(2) count (n =>
      (1 to n count (d => n % d < 1)) == p(0))

}
