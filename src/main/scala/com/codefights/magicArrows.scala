package com.codefights

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
    def magicArrows(v: Int, m: Array[Int]): Double =
        if (v < 1)           1
        else if (m isEmpty)  v
        else {
            val n = m size
            
            {
                magicArrows(v-1, m) + {
                    0 to n-1 map(i => {
                        m(i) -= 1
                        val r = magicArrows(v, m filter(_ > 0))
                        m(i) += 1
                        
                        r
                    })
                }.sum
            } / (1 + n)
        }
    
}
