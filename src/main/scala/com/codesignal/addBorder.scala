package com.codesignal

/** CodeSignal Challenge `addBorder`
  *
  * @author froth30
  * @since  Nov 12, 2019
  */
object addBorder {

  def addBorder(p: Array[String]) = {
    val a = Array("*" * (p(0).size + 2))

    a ++ p.map("*" + _ + "*") ++ a
  }

}
