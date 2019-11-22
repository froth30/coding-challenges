package com.codesignal

/** CodeSignal Challenge `avoidObstacles`
  *
  * @author froth30
  * @since  Nov 22, 2019
  */
object avoidObstacles {

  def avoidObstacles(o: Seq[Int]) =
    2 to 9999 find { j =>
      o forall (_ % j > 0)
    }

}
