package com.codefights

/** CodeFights Challenge `possibleChampions`
  *
  * @author froth30
  * @since  Jul 10, 2018
  */
object possibleChampions {

  def possibleChampions(b: Int, c: Int, e: Int, f: Int) =
    Array("Belgium" -> (b - f > 1 & c != e),
          "Croatia" -> (c - e > 1 & b != f),
          "England" -> (e - c > 1 & b != f),
          "France"  -> (f - b > 1 & c != e)) filter (_ _2) map (_ _1)

}
