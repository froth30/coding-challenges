package com.codesignal

/** CodeSignal Challenge `sumOfDivisors`
  *
  * @author froth30
  * @since  Sep 22, 2019
  */
object sumOfDivisors {

  def sumOfDivisors(n: Int) =
    1 to math.sqrt(n).toInt map (d =>
      if (n % d < 1)
        if (d != n / d)
          d + n / d
        else
          d
      else
        0
    ) sum

}
