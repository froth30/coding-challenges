package com.codesignal

/** CodeSignal Challenge `countTriangles`
  *
  * @author froth30
  * @since  Nov 12, 2019
  */
object countTriangles {

  var x, y = 0

  def countTriangles(v: Seq[Int]*) = {
    ((v(0) zip v(1) permutations) map (_ take 3 sorted) toSet) count (t => {
      val d = (t :+ t(0) sliding 2 map (p => {
        x = p(1)._1 - p(0)._1
        y = p(1)._2 - p(0)._2

        math sqrt x * x + y * y
      })).toSeq sorted

      d(0) + d(1) > d(2)
    })
  }

}
