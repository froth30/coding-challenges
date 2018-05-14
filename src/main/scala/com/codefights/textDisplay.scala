package com.codefights

/** CodeFights Challenge `textDisplay`
  *
  * @author froth30
  * @since  May 13, 2018
  */
object textDisplay {

  def textDisplay(k: Array[Int]): String = {
    var s = ""
    var i = 0

    def m(d: Int) = i = Set(Set(i+d, 0) max, s size) min

    def y = s splitAt i

    def t(c: Int) = {
      val (a,b) = y
      s = a + Map(
        93  -> ";",
        94  -> ",",
        95  -> ".",
        111 -> "'"
      ).getOrElse(c/2, c.asInstanceOf[Char] toLower) + b
      m(1)
    }

    k foreach {
      case 8 =>
        val (a,b) = y
        s = a.dropRight(1) + b
        m(-1)
      case 35 => i = s size
      case 36 => i = 0
      case 37 => m(-1)
      case 39 => m( 1)
      case 46 =>
        val (a,b) = y
        s = a + b.drop(1)
      case c => t(c)
    }

    s
  }

}
