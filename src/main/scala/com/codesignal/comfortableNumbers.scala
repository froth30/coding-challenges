package com.codesignal

/** CodeSignal Challenge `comfortableNumbers`
  *
  * @author froth30
  * @since  Jul 26, 2019
  */
object comfortableNumbers {

  def comfortableNumbers(l: Int, r: Int) = {
    var p = 0
    for (a <- l to r-1; b <- a+1 to r)
      if (c(a, b) & c(b, a))
        p += 1

    p
  }

  def c(a: Int, b: Int) = {
    val s = a + "" map (_ - 48) sum

    b >= a - s & b <= a + s
  }

}
