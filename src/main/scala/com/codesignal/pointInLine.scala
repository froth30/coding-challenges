package com.codesignal

/** CodeSignal Challenge `pointInLine`
  *
  * @author froth30
  * @since  Jul 26, 2019
  */
//noinspection ZeroIndexToHead
object pointInLine {

  def pointInLine(p: Seq[Int], l: Seq[Int]) = l(0) * p(0) + l(1) * p(1) == -l(2)

}
