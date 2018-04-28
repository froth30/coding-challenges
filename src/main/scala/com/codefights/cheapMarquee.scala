package com.codefights

/** CodeFights Challenge `cheapMarquee`
  *
  * @author froth30
  * @since  Apr 27, 2018
  */
object cheapMarquee {

  def cheapMarquee(m: String, w: Int): Int = {
    ???
  }

  def w(c: Char): Seq[Int] = c.toUpper match {
      case 32 => Seq(0,0)  // SPACE
      case 33 => Seq(4)  // !
      case 44 => Seq(2)  // ,
      case 46 => Seq(1)  // .
      case 48 => Seq(3,4,4,3)  // 0
      case 49 => Seq(2,5,1,1)  // 1
      case 50 => Seq(2,3,3,2)  // 2
      case 51 => Seq(3,3,3,2)  // 3
      case 52 => Seq(2,2,5,1)  // 4
      case 53 => Seq(4,3,3,2)  // 5
      case 54 => Seq(3,3,3,2)  // 6
      case 55 => Seq(2,2,2,2)  // 7
      case 56 => Seq(2,3,3,2)  // 8
      case 57 => Seq(2,3,3,3)  // 9
      case 63 => Seq(1,3,2,1)  // ?
      case 65 => Seq(4,2,2,4)  // A
      case 66 => Seq(5,3,3,2)  // B
      case 67 => Seq(3,2,2,2)  // C
      case 68 => Seq(5,2,2,3)  // D
      case 69 => Seq(5,3,3,2)  // E
      case 70 => Seq(5,2,2,1)  // F
      case 71 => Seq(3,2,3,3)  // G
      case 72 => Seq(5,1,1,5)  // H
      case 73 => Seq(2,5,2,2)  // I
      case 74 => Seq(2,2,4,1)  // J
      case 75 => Seq(5,1,2,2)  // K
      case 76 => Seq(5,1,1,1)  // L
      case 77 => Seq(5,2,2,5)  // M
      case 78 => Seq(5,1,2,5)  // N
      case 79 => Seq(3,2,2,3)  // O
      case 80 => Seq(5,2,2,1)  // P
      case 81 => Seq(3,2,3,4)  // Q
      case 82 => Seq(5,3,3,2)  // R
      case 83 => Seq(2,3,3,2)  // S
      case 84 => Seq(1,5,1,1)  // T
      case 85 => Seq(4,1,1,4)  // U
      case 86 => Seq(4,1,2,2)  // V
      case 87 => Seq(4,2,2,5)  // W
      case 88 => Seq(3,2,2,3)  // X
      case 89 => Seq(2,3,1,1)  // Y
      case 90 => Seq(3,3,3,2)  // Z
    }

}
