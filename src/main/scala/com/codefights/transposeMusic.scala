package com.codefights

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
    * @param n  The interval by which to transpose the given note up.
    *           <ul>''Guaranteed constraints:''
    *           <ul>`interval = a + n` where
    *           <br>`a ∈ {'#','b',''}` and
    *           <br>`n ∈ {"1","2",..,"15"}`
    * @return   The transposed note in the same format as the note.
    */
  def transposeMusic(o: String, n: String): String = {
    var i = n toInt

    ???
  }

}
