package com.codefights

/** CodeFights Challenge `mSquare`
  *
  * @author froth30
  * @since  Feb 10, 2018
  */
object mSquare {

  def mSquare(n: Int, c: Int = 0): Int = {
    if (n < 4)
      n + c
    else
      mSquare(n - (
        n to 1 by -1 find (math.sqrt(_) % 1 == 0)
        ).get, c + 1)
  }

}
