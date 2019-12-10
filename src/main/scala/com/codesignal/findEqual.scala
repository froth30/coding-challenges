package com.codesignal

/** CodeSignal Challenge `findEqual`
  *
  * @author froth30
  * @since  Dec 10, 2019
  */
object findEqual {

  def findEqual(s: Seq[Int]) =
    s.distinct.size < s.size

}
