package com.codesignal

/** CodeFights Challenge `kStepMaximization`
  *
  * @author froth30
  * @since  May 05, 2018
  */
object kStepMaximization {

  /** Given an integer, determines the maximum possible number that can be obtained by performing a
    * series of steps. At each step, one of the following operations can be applied to the number:
    * <ul>
    *   <li>Increase the number by `1`.
    *   <li>Multiply the number by `2`.
    *   <li>Rotate the number by `180` degrees, considering the number to be represented as a
    *   seven-segment display character string. If this rotation results in a valid number, then
    *   that valid number is the result of this operation. If this rotation results in an invalid
    *   number, then this operation is impossible.
    * </ul>
    * No more than a specified number of steps are allowed to be performed.
    *
    * @param n  The original integer.
    * @param k  The number of steps allowed to be performed.
    * @return   The maximum value that can be obtained in no more than `k` steps.
    */
  def kStepMaximization(n: Int, k: Int) = f(Set(n), k)

  def f(s: Set[Int], k: Int): Int = {
    var t = Set(0) - 0

    s foreach (n => {
      t += n + 1
      t += n * 2

      val r = "" + n
      if (r forall (c => !Set(51,52,55).contains(c)))
        t += r
          .map(c => Map(6->9, 9->6).getOrElse(c-48, c))
          .reverse.mkString.toInt
    })

    if (k > 1)
      f(t, k-1)
    else
      t max
  }

}
