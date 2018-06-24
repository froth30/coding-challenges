package com.codefights

/** CodeFights Challenge `alternatingKeys`
  *
  * @author froth30
  * @since  Jun 23, 2018
  */
object alternatingKeys {

  val S = "                                                                            R     L              LLLLLLLRRRRRRRRRLLLLRLLLRL"

  def alternatingKeys(t: String): Int = {
    val n = t size
    val s = (0 + t map (S(_))) toArray

    if (n < 2)
      n * 50

    else {
      val p = s.prefixLength(_ < 33) - 1

      p * 50 +
        (p to n).map(i => {
          (s(i-1), s(i)) match {
            case (_, 32) =>
              s(i) = S(s(i-1))
              50
            case (a, b) =>
              if (a == b)
                75
              else
                50
          }
        }).sum
    }
  }

}
