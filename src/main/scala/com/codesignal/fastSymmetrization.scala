package com.codesignal

/** CodeSignal Challenge `fastSymmetrization`
  *
  * @author froth30
  * @since  Aug 12, 2019
  */
object fastSymmetrization {

  def fastSymmetrization(a: Array[Array[Char]]): Array[Array[Char]] = {
    val R = a.size - 1
    val C = a(0).size - 1

    for (r <- 0 to R/2) {
      for (c <- 0 to C/2) {
        val s = Seq(
          a ( r )( c ),
          a ( r )(C-c),
          a (R-r)( c ),
          a (R-r)(C-c))

        val d = s.distinct filter (_ != 42)

        if (d.size > 1)
          return Array()

        val S = d.headOption getOrElse '*'

        a ( r )( c ) = S
        a ( r )(C-c) = S
        a (R-r)( c ) = S
        a (R-r)(C-c) = S
      }
    }

    a
  }

}
