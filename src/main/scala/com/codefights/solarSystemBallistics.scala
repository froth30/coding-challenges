package com.codefights

/** CodeFights Challenge `solarSystemBallistics`
  * 
  * @author froth30
  * @since  Nov 10, 2017
  */
object solarSystemBallistics {
    
    import math._
    
    val B = Map[String, Double](
        "Su" -> 273,
        "Me" -> 2.7,
        "Ve" -> 7.87,
        "Ea" -> 8.807,
        "Ma" -> 2.711,
        "Ju" -> 23.79,
        "Sa" -> 9.44,
        "Ur" -> 7.69,
        "Ne" -> 10.15,
        "Mo" -> .62,
        "Pl" -> -.38,
        "Ga" -> .428,
        "Ca" -> .235,
        "Io" -> .796,
        "Eu" -> .314,
        "Ti" -> .352)
    
    /** Calculates where to place the ACME^TM^ air bag which will prevent
      * passengers from dying in a fiery crash.
      * <p>
      * This is done by determining the horizontal distance a car will travel
      * given a stellar body, angle, and velocity - ignoring curvature and
      * atmospheric resistance (this is only engineering after all).
      *
      * @param b  A stellar body from the given list:
      *           <ul>
      *               <li>'''Body     &#9 → &#9 G [m/s^2^]'''
      *               <li>   Sun      &#9 → &#9 274.0
      *               <li>   Mercury  &#9 → &#9 3.7
      *               <li>   Venus    &#9 → &#9 8.87
      *               <li>   Earth    &#9 → &#9 9.807
      *               <li>   Mars     &#9 → &#9 3.711
      *               <li>   Jupiter  &#9 → &#9 24.79
      *               <li>   Saturn   &#9 → &#9 10.44
      *               <li>   Uranus   &#9 → &#9 8.69
      *               <li>   Neptune  &#9 → &#9 11.15
      *               <li>   Moon     &#9 → &#9 1.62
      *               <li>   Pluto    &#9 → &#9 0.62
      *               <li>   Ganymede &#9 → &#9 1.428
      *               <li>   Callisto &#9 → &#9 1.235
      *               <li>   Io       &#9 → &#9 1.796
      *               <li>   Europa   &#9 → &#9 1.314
      *               <li>   Titan    &#9 → &#9 1.352
      *           </ul>
      * @param a  The angle at which the car is ejected     [deg]
      * @param v  The velocity at which the car is ejected  [m/s]
      * @return   The horizontal distance the car will travel.
      */
    def solarSystemBallistics(b: String, a: Int, v: Int) =
        abs(v * v * sin(a * Pi/90) / (B(b take 2) + 1))
    
}
