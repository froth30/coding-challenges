package com.codefights

/**
  * CodeFights Challenge `rotateArrayFromIndex`
  *
  * @since Jul 30, 2017
  * @author froth30
  */
object RotateArrayFromIndex {
    
    def rotateArrayFromIndex(v: Array[Int], s: Int, e: Int) = {
        var S = math.min(s, v.length - 1)
        var E = math.min(e, v.length - 1)
        var I = v
        
        if (e < s) {
            val t = S
            S = E
            E = t
            I = v(E) +: v.slice(S, E)
        } else
            I = v.slice(S + 1, E + 1) :+ v(S)
        
        v.take(S) ++ I ++ v.slice(E + 1, v.length)
    }
    
}
