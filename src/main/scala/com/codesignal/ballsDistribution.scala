package com.codesignal

/** CodeSignal Challenge `ballsDistribution`
  *
  * @author froth30
  * @since Aug 11, 2019
  */
object ballsDistribution {

  /** You have a set of balls that are colored in such a way that there is
    * `ballsPerColor` balls of each of the given number of `colors`. You also
    * have an infinite number of boxes of the same max capacity `boxSize`.
    * <br><br>
    * You distribute the balls among the boxes as follows:
    * <ul>
    *   <li>first you fill up the first box, then the second, etc.
    *   <li>first you use all of the balls of the first color, then all of the
    *   balls of the second color, etc.
    * </ul>
    * Find the number of colors for which there is more than one box that
    * contains a ball of that color.
    *
    * @param c `colors` – The number of colors as a positive integer.
    * @param q `ballsPerColor` – The number of balls of each color as a positive integer.
    * @param s `boxSize` – The max capacity of the boxes as a positive integer.
    * @return The number of colors for which there is more than one box that contains a ball of that color.
    */
  def ballsDistribution(c: Int, q: Int, s: Int) = {
    var n = 0     // number of ball colors that overflow into a second box
    var b = 0     // balls in current box

    for (_ <- 1 to c) {
      b += q      // add all the balls of one color to the current box
      if (b > s)  // check for overflow
        n += 1
      b %= s      // move overflown balls to next box
    }

    n
  }

}
