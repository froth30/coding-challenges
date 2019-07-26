package com.codesignal

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
      * @param T  The terrain, expressed as a matrix of xy-coordinate pairs
      *           <ul>''Guaranteed constraints:'' &#9 `2 ≤ T.length ≤ 1000`
      *                                   <br>&#9 &#9 `T[0][0] = 0`
      *                                   <br>&#9 &#9 `T[i].length = 2`
      *                                   <br>&#9 &#9 `0 ≤ T[i][0] ≤ 20000`
      *                                   <br>&#9 &#9 `-1000 ≤ T[i][1] ≤ 1000`
      * @param X  The initial velocity along the horizontal axis
      *           <ul>''Guaranteed constraints:'' &#9 `1 ≤ X ≤ 1000`
      * @param Y  The initial velocity along the vertical axis
      *           <ul>''Guaranteed constraints:'' &#9 `-1000 ≤ Y ≤ 1000`
      * @param h  The initial release height
      *           <ul>''Guaranteed constraints:'' &#9 `-1000 ≤ h ≤ 1000`
      * @return   The xy-coordinate of impact with the terrain.
      */
    def incoming(T: A[A[D]], X: D, Y: D, h: D): A[D] = {
        f(T, X, Y, h)
    }
    
    def f(T: A[A[D]], X: D, Y: D, h: D): A[D] = {
        val t = (T(1)(0) - T(0)(0)) / X
        val y = h + Y * t - 4.9 * t * t
        
        if (y > T(1)(1))
            f(T tail, X, Y - 9.8 * t, y)
        else {
            val m = (T(1)(1) - T(0)(1)) / (T(1)(0) - T(0)(0))
            val x = (-X*X * math.sqrt(math.pow(m - Y/X, 2) + 98*(h - y) / 5 / X / X)
                - m*X*X + X*Y) * 5 / 49
            
            Array(
                x
                ,
                m * x + T(0)(0)
            )
        }
    }
    
}
