package com.codefights

/**
  * CodeFights Challenge `chainReaction2`
  *
  * @since Aug 13, 2017
  * @author froth30
  */
object chainReaction2 {
    
    import math.abs
    
    /**
      * Play out the two-player 'Chain Reaction' game until it is certain which player won (or it's a draw), and then return the result.
      *
      * @param r The number of rows on the board, constrained to <tt>2 ≤ r ≤ 400</tt>.
      * @param c The number of columns on the board, constrained to <tt>2 ≤ c ≤ 400</tt>.
      * @param m A list of positions that indicates where the players placed their orbs during their alternating turns. More specifically, <tt>m[i]</tt> represents the coordinates of the cell on which a player places their orb on the <tt>i^th^</tt> turn of the game. <b>Red</b> makes the first move, while <b>Green</b> makes the next move, and they alternate in this pattern until the end of the game.
      * @return The winner of the game (i.e. <tt>"Red won"</tt> or <tt>"Green won"</tt>). Otherwise, if neither player won, the word <tt>"draw"</tt>.
      */
    def chainReaction2(r: Int, c: Int, m: Array[Array[Int]]): String = {
        val B = Array.fill(r,c) (0)
        val R = r - 1
        val C = c - 1
    
        m.indices foreach (i => {
            val t = i % 2 * 2 - 1
            B (m(i)(0)) (m(i)(1)) -= t
    
            /** Propagate explosions until there are no more orbs at critical mass. */
            def x {
                0 to R foreach (r =>
                    0 to C foreach (c => {
                        val T = (r, c) match {
                            case (0,0) | (0,C) | (R,0) | (R,C) => 1
                            case (0,_) | (R,_) | (_,0) | (_,C) => 2
                            case _ => 3
                        }
                        if (B(r)(c) * t > T) {
                            B(r)(c) = 0
                            for ((i: Int, j: Int) <- Seq((0,1), (0,-1), (1,0), (-1,0)))
                                try {
                                    val n = abs(B(r+i)(c+j)) * t + t
                                    B(r+i)(c+j) = n
                                    if (abs(n) > 1) x
                                }
                                catch { case _ => }
                        }
                    }))
            }
            x
            
            if (i > 0) {
                if (B.map(_ max).max <  1)  return "Red won"
                if (B.map(_ min).min > -1)  return "Green won"
            }
        })
        
        "draw"
    }
    
}
