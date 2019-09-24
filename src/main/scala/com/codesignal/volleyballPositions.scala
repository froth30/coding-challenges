package com.codesignal

/** CodeSignal Challenge `volleyballPositions`
  *
  * @author froth30
  * @since  Sep 23, 2019
  */
object volleyballPositions {

  type A = Array[Array[String]]

  def volleyballPositions(f: A, k: Int) = {
    def v(k: Int): A =
      if (k > 0) {
        f(2)(2) = f(3)(2)
        f(3)(2) = f(2)(1)
        f(2)(1) = f(3)(0)
        f(3)(0) = f(1)(0)
        f(1)(0) = f(0)(1)
        f(0)(1) = f(1)(2)
        f(1)(2) = f(2)(2)
        f(2)(2) = "empty"

        v(k - 1)
      }
      else f

    v(k % 6)
  }

}
