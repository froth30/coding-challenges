package com.codewars

/** Codewars Kata `xo`
  *
  * @author froth30
  * @since  Sep 02, 2019
  */
object xo {

  /** Checks to see if the given string has the same number of <i>X</i>'s and
    * <i>O</i>'s (case insensitive).
    *
    * @param str a string containing any characters
    * @return `true` if the string contains an equal number of <i>X</i>'s and
    *   <i>O</i>'s; `false` otherwise.
    */
  def xo(str: String): Boolean = {
    val s = str.toLowerCase

    s.count(_ == 'x') == s.count(_ == 'o')
  }

}
