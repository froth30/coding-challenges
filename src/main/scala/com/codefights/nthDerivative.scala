package com.codefights

/** CodeFights Challenge `nthDerivative`
  *
  * @author froth30
  * @since  May 07, 2018
  */
object nthDerivative {

  def nthDerivative(c: Array[Int], n: Int, x: Int): Int = {
    var a = c
    def p = a indices

    for (_ <- 1 to n) {
      val d = p map (i => a(i) * i)
      if (d nonEmpty)
        a = d.tail toArray
    }

    p.map(i => a(i) * math.pow(x, i)).sum toInt
  }

}
