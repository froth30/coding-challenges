package com.codefights

/** CodeFights Challenge `woodBars`
  *
  * @author froth30
  * @since  Jan 06, 2018
  */
object woodBars {

  def woodBars(b: Seq[Int]) = {
    var (r, p, d) = (b, b, 8)
    while (r.size > 1) {
      p = r.sorted take 2
      d = p(1) - p(0)

      p = Seq(p(0), p(0), d)
      if (d < 1) p = p take 1

      r = (r drop 2) ++ p
    }

    r(0)
  }

}
