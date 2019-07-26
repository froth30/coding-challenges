package com.codesignal

/** CodeFights Challenge `mSquare`
  *
  * @author froth30
  * @since  Feb 10, 2018
  */
object mSquare {

  /** Finds the minimum number of squares that add up to the given number.
    *
    * @example  <li>For `n = 4`, the output should be<br>
    *               `mSquare(n) = 1`.<br>
    *               `2`^`2`^` = 4`
    *           </li>
    *           <br>
    *           <li>For `n = 7`, the output should be<br>
    *               `mSquare(n) = 4`.<br>
    *               `2`^`2`^` + 1`^`2`^` + 1`^`2`^` + 1`^`2`^` = 7`
    *           </li>
    *
    * @param n  An integer &#9 ''Guaranteed constraints:'' &#9 `0 < n < 2`^`31`^
    *
    * @return   The minimum number of squares that sum up to `n`.
    */
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

  /** Shorthand function for computing the square root of a number.
    *
    * @see [[math.sqrt]]
    */
  def r = math sqrt _

  /** Determines whether the given integer is a square. */
  def s = r(_: Int) % 1 == 0

}
