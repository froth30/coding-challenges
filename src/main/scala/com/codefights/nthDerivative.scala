package com.codefights

/** CodeFights Challenge `nthDerivative`
  *
  * @author froth30
  * @since  May 07, 2018
  */
object nthDerivative {

  def nthDerivative(c: Array[Int], n: Int, x: Int): Int = {
    if (n < 1)
      c.indices.map(i => c(i) * math.pow(x, i)).sum toInt
    else {
      val d = c.indices.map(i => c(i) * i)
      if (d isEmpty)
        0
      else
        nthDerivative(d.tail toArray, n - 1, x)
    }
  }

}
