package com.codesignal

/** CodeSignal Challenge `neighboringCells`
  *
  * @author froth30
  * @since  Nov 08, 2019
  */
object neighboringCells {

  def neighboringCells(m: Array[Array[Int]]) = {
    val R = m    .size - 1
    val C = m(0) .size - 1

    for {
      r <- 0 to R
      c <- 0 to C
    } {
      def i = m(r)(c) += 1

      if (r > 0) i
      if (r < R) i
      if (c > 0) i
      if (c < C) i
    }

    m
  }

}
