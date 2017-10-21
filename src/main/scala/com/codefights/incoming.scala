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
      *           <ul>''Guaranteed constraints:'' &#9 `2 ≤ t.length ≤ 1000`
      *                                   <br>&#9 &#9 `t[0][0] = 0`
      *                                   <br>&#9 &#9 `t[i].length = 2`
      *                                   <br>&#9 &#9 `0 ≤ t[i][0] ≤ 20000`
      *                                   <br>&#9 &#9 `-1000 ≤ t[i][1] ≤ 1000`
      * @param x  The initial velocity along the horizontal axis
      *           <ul>''Guaranteed constraints:'' &#9 `1 ≤ x ≤ 1000`
      * @param y  The initial velocity along the vertical axis
      *           <ul>''Guaranteed constraints:'' &#9 `-1000 ≤ y ≤ 1000`
      * @param h  The initial release height
      *           <ul>''Guaranteed constraints:'' &#9 `-1000 ≤ h ≤ 1000`
      * @return   The xy-coordinate of impact with the terrain.
      */
    def incoming(t: A[A[D]], x: D, y: D, h: D): A[D] = {
        ???
    }
    
}
