package com.codesignal

/** CodeFights Challenge `transposeMusic`
  *
  * @author froth30
  * @since  Mar 11, 2018
  */
object transposeMusic {

  /** Transposes a given note up by the given musical interval.
    *
    * @param o  The musical note to transpose.
    *           <ul>''Guaranteed constraints:''
    *           <ul>`note = l + a` where
    *           <br>`l ∈ {'A'...'G'}` and
    *           <br>`a ∈ {'','#','##','b','bb'}`
    * @param i  The interval by which to transpose the given note up.
    *           <ul>''Guaranteed constraints:''
    *           <ul>`interval = a + n` where
    *           <br>`a ∈ {'#','b',''}` and
    *           <br>`n ∈ {"1","2",..,"15"}`
    * @return   The transposed note in the same format as the note.
    */
  def transposeMusic(o: String, i: String): String = {
    // Resolve note
    var n = r(o)

    // Half steps in interval:
    //        0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 ...
    val h = ("1  b2 #2 b3 #3 4     5  b6 #6 b7 #7 8  b9 #9 b10#1011    12 b13#13b14#1415" indexOf i) / 3

    def a = n = r(n + "#")

    for (_ <- 1 to h) a

    if (n.last == '#' & i(0) == 'b') {
      a
      r(n + "b")
    }
    else n
  }

  /** Resolves a given note, simplifying . */
  def r(o: String) = "" + (o splitAt 1 match {
    case ("B"|"E", "##")              =>  (o(0) + 1).toChar + "#"
    case ("B"|"E", "#" ) | (_, "##")  =>  (o(0) + 1).toChar
    case ("C"|"F", "bb")              =>  (o(0) - 1).toChar + "b"
    case ("C"|"F", "b" ) | (_, "bb")  =>  (o(0) - 1).toChar
    case (_, "b#") => o(0) // special case for internal algorithm
    case  _        => o
  })

}
