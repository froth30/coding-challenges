package com.codesignal

/** CodeSignal Challenge `fractionMultiplication`
  *
  * @author froth30
  * @since  Nov 23, 2019
  */
object fractionMultiplication {

  def fractionMultiplication(a: Seq[Int], b: Seq[Int]) = {
    var d, g,
    n = a(0) * b(0)
    d = a(1) * b(1)

    g = 2 to n filter (k => n % k + d % k < 1) max

    Array(n/g, d/g)
  }

}
