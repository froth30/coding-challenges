package com.codesignal

/** CodeSignal Challenge `extractEachKth`
  *
  * @author froth30
  * @since  Oct 21, 2019
  */
object extractEachKth {

  def extractEachKth(s: Seq[Int], k: Int) =
    s grouped k flatMap (_ take k-1) toArray

}
