package com.codefights

/** CodeFights Challenge `cheapMarquee`
  *
  * @author froth30
  * @since  Apr 27, 2018
  */
object cheapMarquee {

  def cheapMarquee(m: String, w: Int) =
    m.flatMap(c => Map(
      32 -> Seq(0,0),        // SPACE
      33 -> Seq(4,0),        // !
      44 -> Seq(2,0),        // ,
      46 -> Seq(1,0),        // .
      48 -> Seq(3,4,4,3,0),  // 0
      49 -> Seq(2,5,1,1,0),  // 1
      50 -> Seq(2,3,3,2,0),  // 2
      51 -> Seq(3,3,3,2,0),  // 3
      52 -> Seq(2,2,5,1,0),  // 4
      53 -> Seq(4,3,3,2,0),  // 5
      54 -> Seq(3,3,3,2,0),  // 6
      55 -> Seq(2,2,2,2,0),  // 7
      56 -> Seq(2,3,3,2,0),  // 8
      57 -> Seq(2,3,3,3,0),  // 9
      63 -> Seq(1,3,2,1,0),  // ?
      65 -> Seq(4,2,2,4,0),  // A
      66 -> Seq(5,3,3,2,0),  // B
      67 -> Seq(3,2,2,2,0),  // C
      68 -> Seq(5,2,2,3,0),  // D
      69 -> Seq(5,3,3,2,0),  // E
      70 -> Seq(5,2,2,1,0),  // F
      71 -> Seq(3,2,3,3,0),  // G
      72 -> Seq(5,1,1,5,0),  // H
      73 -> Seq(2,5,2,2,0),  // I
      74 -> Seq(2,2,4,1,0),  // J
      75 -> Seq(5,1,2,2,0),  // K
      76 -> Seq(5,1,1,1,0),  // L
      77 -> Seq(5,2,2,5,0),  // M
      78 -> Seq(5,1,2,5,0),  // N
      79 -> Seq(3,2,2,3,0),  // O
      80 -> Seq(5,2,2,1,0),  // P
      81 -> Seq(3,2,3,4,0),  // Q
      82 -> Seq(5,3,3,2,0),  // R
      83 -> Seq(2,3,3,2,0),  // S
      84 -> Seq(1,5,1,1,0),  // T
      85 -> Seq(4,1,1,4,0),  // U
      86 -> Seq(4,1,2,2,0),  // V
      87 -> Seq(4,2,2,5,0),  // W
      88 -> Seq(3,2,2,3,0),  // X
      89 -> Seq(2,3,1,1,0),  // Y
      90 -> Seq(3,3,3,2,0)   // Z
    )
      .getOrElse(c toUpper, Seq[Int]()))
      .sliding(w, 1)
      .foldLeft(0)(_ max _.sum)

}