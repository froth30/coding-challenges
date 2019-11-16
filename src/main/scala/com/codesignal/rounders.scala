package com.codesignal

/** CodeSignal Challenge `rounders`
  *
  * @author froth30
  * @since  Nov 15, 2019
  */
object rounders {

  def rounders(n: Int) = {
    var
    m,  // most significant digit
    p   // power of ten
    = 0

    p = 1

    (n + "" :\ 0) { (d, c) =>  // (digit: Char, carryover: Int)
      m = c + d - 48
      p *= 10

      (m + 5) / 10
    }

    m * p / 10
  }

  def main(args: Array[String]) = {
    println(rounders(9567))
  }

}
