package com.codesignal

/** CodeSignal Challenge `isIdentityMatrix`
  *
  * @author froth30
  * @since  Dec 23, 2019
  */
object isIdentityMatrix {

  def isIdentityMatrix(m: Array[Array[Int]]) = {
    val n = m size

    (0 to n-1).forall(i => m(i)(i) == 1) &
      m.flatten.count(_ < 1) == n*n-n
  }

}
