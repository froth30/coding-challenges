package com.codesignal

/** CodeSignal Challenge `divisorsSubset`
  *
  * @author froth30
  * @since  Dec 23, 2019
  */
object divisorsSubset {

  def divisorsSubset(s: Seq[Int], n: Int) =
    1 to n count { k =>
      s forall (k % _ < 1)
    }

}
