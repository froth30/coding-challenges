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

  def c(a: Int, b: Int) = b >= a - s(a) & b <= a + s(a)

  def s(x: Int) = (x + "").map(_ asDigit) sum

}
