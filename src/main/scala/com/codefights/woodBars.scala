package com.codefights

/** CodeFights Challenge `woodBars`
  *
  * @author froth30
  * @since  Jan 06, 2018
  */
object woodBars {

  def woodBars(b: Seq[Int]) = {
    val p = b.sorted take 2
    val r = p.last % p(0)

    if (r > 0) r else p(0)
  }

}
