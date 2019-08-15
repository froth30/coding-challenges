package com.codesignal

/** CodeSignal Challenge `josephusProblem`
  *
  * @author froth30
  * @since  Aug 14, 2019
  */
object josephusProblem {

  def josephusProblem(n: Int, k: Int) = {
    var p = 1 to n toList
    var i = k - 1

    for (_ <- 2 to n) {
      p = p filter (_ != p(i))
      i = (i - 1 + k) % p.size
    }

    p(0)
  }

}
