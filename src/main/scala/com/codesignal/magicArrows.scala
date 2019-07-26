package com.codesignal

import com.Strings
import com.Strings.ImplicitConversions._

/** CodeFights Challenge `magicArrows`
  *
  * @author froth30
  * @since  Oct 15, 2017
  */
object magicArrows {
    
    /** Calculates the average number of shots required to slay a villain,
      * based on his hitpoints as well as those of his minions.
      *
      * @param v  Hitpoints of the villain
      *           <ul>''Guaranteed constraints:'' &#9
      *               `1 ≤ villain ≤ 100`
      * @param m  Hitpoints of the villain's minions
      *           <ul>''Guaranteed constraints:'' &#9
      *               `0 ≤ minions.length ≤ 50`,
      *               `1 ≤ minions[i] ≤ 100`
      * @return   The average number of ''iArrows'' required to kill the
      *           villain.
      */
    def magicArrows(v: Int, m: Array[Int]): Double = (v, m) match {
        case (0, _) | (_, Array())  => v
        case (1, Array(1))          => 1.5
        case (2, Array(1))          => 2.75
        case (1, Array(1, 1))       => 2
        case (2, Array(1, 1))       => 3.5
        case  _                     => {
            val n = m size
            
            {
                1 + magicArrows(v-1, m) + {
                    0 to n-1 map(i => 1 + {
                        val c = m clone
                        
                        c(i) -= 1
                        magicArrows(v, c filter(_ > 0))
                    })
                }.sum
            } / (1 + n)
        }
    }
    
}
