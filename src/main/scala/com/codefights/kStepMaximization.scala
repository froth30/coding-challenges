package com.codefights

/** CodeFights Challenge `kStepMaximization`
  *
  * @author froth30
  * @since  May 05, 2018
  */
object kStepMaximization {

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
