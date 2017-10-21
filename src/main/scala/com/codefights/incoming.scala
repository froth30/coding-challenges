package com.codefights

/** CodeFights Challenge `incoming`
  * 
  * @author froth30
  * @since  Oct 21, 2017
  */
object incoming {
    
    type A[T] = Array[T]
    type D    = Double
    
    /** Calculates the impact location of an incoming ballistic projectile,
      * launched over a certain terrain.
      *
      * @param t  The terrain, expressed as a matrix of xy-coordinate pairs
      * @param x  The initial velocity along the horizontal axis
      * @param y  The initial velocity along the vertical axis
      * @param h  The initial release height
      * @return   The xy-coordinate of impact with the terrain.
      */
    def incoming(t: A[A[D]], x: D, y: D, h: D): A[D] = {
        ???
    }
    
}
