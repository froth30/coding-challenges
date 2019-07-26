package com.codefights

/** CodeFights Challenge `iterMask`
  *
  * @author froth30
  * @since  Jan 29, 2018
  */
object iterMask {

  def r(n: Int, k: Int): Seq[Int] =
    if (n == 0)
      Seq(0)
    else if ((1 << k & n) < 1)
      r(n, k - 1)
    else {
      val t = r(n & ~(1 << k), k - 1)
      t.map(1 << k | _) ++ t
    }

  def iterMask(n: Int) = r(n, 31) toArray

}
