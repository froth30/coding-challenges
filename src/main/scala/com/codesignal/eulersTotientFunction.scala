package com.codesignal

/** CodeSignal Challenge `eulersTotientFunction`
  *
  * @author froth30
  * @since  Aug 13, 2019
  */
object eulersTotientFunction {

  def eulersTotientFunction(n: Int) =
    1 to n count (BigInt(_).gcd(n) < 2)

}
