package com.codefights

/**
  * Created by froth30 on 7/11/2017.
  */
object Racers {
    
    def racers(track: Int, accel: Array[Int], spd: Array[Int]): Array[Int] = {
        spd.indices.zip(accel zip spd)
                .sortBy(p => timeToReachDistance(track, p._2._1, p._2._2))
                .map(_._1).toArray
    }
    
    def timeToReachDistance(dist: Double, accel: Double, spd: Double): Double = {
        val distLeft = dist - zeroToTopSpeedDistance(accel, spd)
        if (distLeft > 0) {
            val timeLeft = distLeft / spd
            zeroToTopSpeedTime(accel, spd) + timeLeft
        }
        else timeToReachDistance(dist, accel)
    }
    
    def zeroToTopSpeedDistance(accel: Double, spd: Double): Double = {
        // v^2 = v0^2 + 2a(x - x0)
        // v^2 = 2ax
        // x = v^2 / 2a
        math.pow(spd, 2) / (2 * accel)
    }
    
    def zeroToTopSpeedTime(accel: Double, spd: Double): Double = {
        // v = v0 + at
        // v = at
        // t = v/a
        spd / accel
    }
    
    def timeToReachDistance(dist: Double, accel: Double): Double = {
        // x = x0 + v0t + 1/2 at^2
        // x = 1/2 at^2
        // t^2 = 2x/a
        // t = sqrt(2x/a)
        math.sqrt(2 * dist / accel)
    }
    
}
