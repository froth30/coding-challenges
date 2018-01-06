package com.codefights

/** CodeFights Challenge `woodBars`
  *
  * @author froth30
  * @since  Jan 06, 2018
  */
object woodBars {

  def woodBars(b: Seq[Int]): Int =
    try {
      var p = b.sorted take 2
      val d = p(1) - p(0)
      p = Seq(p(0), p(0), d)
      if (d < 1) p = p take 1

      woodBars((b drop 2) ++ p)
    }
    catch {
      case _ => b(0)
    }

}
