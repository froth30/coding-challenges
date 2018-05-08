package com.codefights

/** CodeFights Challenge `nthDerivative`
  *
  * @author froth30
  * @since  May 07, 2018
  */
object nthDerivative {

  val m = 1000000007

  def nthDerivative(c: Array[Int], n: Int, x: Int) = {
    var a = c map (BigInt(_))
    def p = a indices

    for (_ <- 1 to n) {
      val d = p map (i => a(i) * i)
      if (d nonEmpty)
        a = d.tail toArray
    }

    val r = p.map(i => a(i) * BigInt(math.pow(x,i).toInt) % m).sum.toInt % m

    if (r < 0)
      r + m
    else
      r
  }

}
