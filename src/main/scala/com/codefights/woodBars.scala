package com.codefights

/** CodeFights Challenge `woodBars`
  *
  * @author froth30
  * @since  Jan 06, 2018
  */
object woodBars {

  def woodBars(b: Seq[Int]) = {
    var (r, p, d) = (b.sorted take 2, b, 0)
    while (r.size > 1) {
      p = r take 2
      d = p(1) - p(0)

      p = Seq(p(0), p(0), d)
      if (d < 1) p = p take 1

      r = (p sorted) ++ (r drop 2)
    }

    r(0)
  }

}
