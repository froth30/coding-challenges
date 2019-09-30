package com.codesignal

/** CodeSignal Challenge `waterTubes`
  *
  * @author froth30
  * @since  Sep 29, 2019
  */
object waterTubes {

  /** Determines how many minutes must elapse for all the water tubes to empty.
    *
    * @param V volume of water in each tube, in liters (L)
    * @param Q volumetric flow rate for each tube, in liters per minute (L/min)
    * @return the number of minutes required to empty all the tubes.
    */
  def waterTubes(V: Seq[Int], Q: Seq[Int]) =
    V.indices map (i => 1d * V(i) / Q(i) ceil) max

}
