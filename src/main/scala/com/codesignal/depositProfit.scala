package com.codesignal

/** CodeSignal Challenge `depositProfit`
  *
  * @author froth30
  * @since  Nov 17, 2019
  */
object depositProfit {

  def L = math log _

  def depositProfit(p: Double*) =
    L(p(2)/p(0)) / L(1+p(1)/100) ceil

}
