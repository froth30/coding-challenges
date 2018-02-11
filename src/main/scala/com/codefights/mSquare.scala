package com.codefights

/** CodeFights Challenge `mSquare`
  *
  * @author froth30
  * @since  Feb 10, 2018
  */
object mSquare {

  def mSquare(n: Int): Int = {
    if (s(n))
      return 1

    var k = n
    while (k % 4 < 1)
      k >>= 2
    if (k % 8 > 6)
      return 4

    for (i <- 1 to r(n).toInt)
      if (s(n - i * i))
        return 2

    3
  }

  def r = math sqrt _

  def s = r(_: Int) % 1 == 0

}
