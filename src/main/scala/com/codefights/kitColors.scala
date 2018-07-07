package com.codefights

/** CodeFights Challenge `kitColors`
  *
  * @author froth30
  * @since  Jul 07, 2018
  */
object kitColors {

  def p(c: String, i: Int) = Integer parseInt (c.slice(i, i+2), 16)

  def kitColors(a: Array[String], b: Array[String]): Array[Array[String]] = {
    val d = a.map(a => b.map(b => {
      def c(i: Int) = (p(a,i) - p(b,i)) abs

      c(1) + c(3) + c(5)
    }))

    ???
  }

}
