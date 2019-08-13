package com.codesignal

/** CodeSignal Challenge `equationTemplate`
  *
  * @author froth30
  * @since  Aug 13, 2019
  */
object equationTemplate {

  def equationTemplate(v: Seq[Int]) =
    v.exists(x => x != 0 & x * x == v.product) |
    v(0) * v(1) == v(2) * v(3) |
    v(0) * v(2) == v(1) * v(3) |
    v(0) * v(3) == v(1) * v(2)

}
