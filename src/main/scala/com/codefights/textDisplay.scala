package com.codefights

/** CodeFights Challenge `textDisplay`
  *
  * @author froth30
  * @since  May 13, 2018
  */
object textDisplay {

  def textDisplay(k: Seq[Int]) = {
    var s = ""
    var i = 0

    def L = i = Set(i-1, 0     ) max
    def R = i = Set(i+1, s size) min

    def y = s splitAt i

    def t(c: Int) = {
      val (a,b) = y
      s = a + Map(
        93  -> ";",
        94  -> ",",
        95  -> ".",
        111 -> "'"
      ).getOrElse(c/2, c.asInstanceOf[Char] toLower) + b
      R
    }

    k foreach {
      case 8 =>
        val (a,b) = y
        s = a.dropRight(1) + b
        L
      case 35 => i = s size
      case 36 => i = 0
      case 37 => L
      case 39 => R
      case 46 =>
        val (a,b) = y
        s = a + b.drop(1)
      case c => t(c)
    }

    s
  }

}
