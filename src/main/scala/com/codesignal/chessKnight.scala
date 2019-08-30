package com.codesignal

/** CodeSignal Challenge `chessKnight`
  *
  * @author froth30
  * @since  Aug 29, 2019
  */
object chessKnight {

  /*
  • • • • • • • •
  • • 3 • 2 • • •
  • 4 • • • 1 • •
  • • • N • • • •
  • 5 • • • 8 • •
  • • 6 • 7 • • •
   */

  def chessKnight(c: String) = {
    val f = c(0) - 96
    val r = c(1) - 48
    var n = 255

    if (f < 3) n &= 231  // 11100111
    if (f < 2) n &= 195  // 11000011
    if (f > 6) n &= 126  // 01111110
    if (f > 7) n &=  60  // 00111100
    if (r < 3) n &= 249  // 11111001
    if (r < 2) n &= 240  // 11110000
    if (r > 6) n &= 159  // 10011111
    if (r > 7) n &=  15  // 00001111

    n.toBinaryString map (_ - 48) sum
  }

}
