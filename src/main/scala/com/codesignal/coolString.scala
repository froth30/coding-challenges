package com.codesignal

/** CodeSignal Challenge `coolString`
  *
  * @author froth30
  * @since  Jul 26, 2019
  */
object coolString {

  def coolString(s: String) = s.forall(_ isLetter) &
    (1 to s.length-1).forall(i => p(s(i-1)-27, s(i)-27))

  def p(a: Int, b: Int) = (a & b) < 64 & (a | b) > 63

}
