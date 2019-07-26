package com.codesignal

/** CodeFights Challenge `kbonacci`
  *
  * @author froth30
  * @since  May 14, 2018
  */
object kbonacci {

  def kbonacci(k: Int, n: Int) = {
    val a = Array.fill(n+1)(1)

    for (i <- k to n)
      a(i) = a.slice(i-k,i) sum

    a(n) + ""
  }

}
