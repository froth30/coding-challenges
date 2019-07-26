package com.codesignal

/** CodeSignal Challenge `comfortableNumbers`
  *
  * @author froth30
  * @since  Jul 26, 2019
  */
object comfortableNumbers {

  def comfortableNumbers(l: Int, r: Int) =
    l to r map (a => a+1 to r count (b => c(a,b) & c(b,a))) sum

  def c(a: Int, b: Int) = {
    val s = a + "" map (_ - 48) sum

    b >= a - s & b <= a + s
  }

}
