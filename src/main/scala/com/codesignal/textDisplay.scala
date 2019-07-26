package com.codesignal

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
    def a = y _1
    def b = y _2

    k foreach {
      case 8 =>
        s = a.dropRight(1) + b
        L
      case 35 => i = s size
      case 36 => i = 0
      case 37 => L
      case 39 => R
      case 46 =>
        s = a + b.drop(1)
      case c =>
        s = a + "                                                0123456789       abcdefghijklmnopqrstuvwxyz                                                                                               ; , .                               '"(c) + b
        R
    }

    s
  }

}
