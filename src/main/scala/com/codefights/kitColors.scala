package com.codefights

/** CodeFights Challenge `kitColors`
  *
  * @author froth30
  * @since  Jul 07, 2018
  */
object kitColors {

  type A = Array[String]

  def p(c: String, i: Int) = Integer parseInt(c slice(i, i+2), 16)

  def kitColors(a: A, b: A) = {
    val d = a map (a => b map (b => Seq(1,3,5).map(i => (p(a,i) - p(b,i)).abs) sum))
    val m = (d map (_ max)) max

    (for { i <- a indices

           j <- b indices

           if d(i)(j) == m
    } yield Array(a(i), b(j))) toArray
  }

}
