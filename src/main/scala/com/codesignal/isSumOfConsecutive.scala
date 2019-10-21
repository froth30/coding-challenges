package com.codesignal

/** CodeSignal Challenge `isSumOfConsecutive`
  *
  * @author froth30
  * @since  Oct 20, 2019
  */
object isSumOfConsecutive {

  def isSumOfConsecutive(n: Int) =
    2 to n exists (d => {
      val q = n * 1d / d
      (d % 2 < 1 & q % 1 == .5 |
        d % 2 > 0 & q % 1 == 0) &
        q - d/2 > 0
    })

}
