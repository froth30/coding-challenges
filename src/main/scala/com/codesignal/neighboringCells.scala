package com.codesignal

/** CodeSignal Challenge `neighboringCells`
  *
  * @author froth30
  * @since  Nov 08, 2019
  */
object neighboringCells {

  def neighboringCells(m: Array[Array[Int]]) = {
    val R = m size
    val C = m(0) size

    for {
      r <- 1 to R-2
      c <- 1 to C-2
    } m( r )( c ) = 4

    if (R * C > 1)
      if (R < 2) {
        m( 0 )( 0 ) = 1
        m( 0 )(C-1) = 1
        for (c <- 1 to C-2)
          m( 0 )( c ) = 2
      } else if (C < 2) {
        m( 0 )( 0 ) = 1
        m(R-1)( 0 ) = 1
        for (r <- 1 to R-2)
          m( r )( 0 ) = 2
      } else {
        m( 0 )( 0 ) = 2
        m( 0 )(C-1) = 2
        m(R-1)( 0 ) = 2
        m(R-1)(C-1) = 2
        for (c <- 1 to C-2) {
          m( 0 )( c ) = 3
          m(R-1)( c ) = 3
        }
        for (r <- 1 to R-2) {
          m( r )( 0 ) = 3
          m( r )(C-1) = 3
        }
      }

    m
  }

}
