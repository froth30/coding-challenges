package com.codefights

/**
  * Created by froth30 on 7/11/2017.
  */
object Racers {
    
    def racers(d: Int, a: Array[Int], v: Array[Int]) = {
        val r = a.indices
                .map(i => (i, a(i), v(i), 1d * v(i) / a(i)))
                .map { case (i, a, v, t) =>
                    val x = a * t * t / 2
                    (i, if (x > d) math.sqrt(2d * d / a) else t + 1d * (d - x) / v)
                }
                .sortBy(_._2)
                .map(_._1)
    
        r.indices.map(r.indexOf(_)).toArray
    }
    
}
