package com.codesignal

/** CodeSignal Challenge `findHyperlink`
  *
  * @author froth30
  * @since  Sep 04, 2019
  */
object findHyperlink {

  def findHyperlink = (_: String)
    .split('<')(1).drop(8)
    .split('>')(0) dropRight 1

}
