package com.codefights

/**
  * CodeFights Challenge `rotateArrayFromIndex`
  *
  * @since Jul 30, 2017
  * @author froth30
  */
object RotateArrayFromIndex {
    
    def rotateArrayFromIndex(V: Array[Int], S: Int, E: Int) = {
        var s = math.min(S, V.length - 1)
        var e = math.min(E, V.length - 1)
        var I = V
        
        if (E < S) {
            val t = s
            s = e
            e = t
            I = V(e) +: V.slice(s, e)
        } else
            I = V.slice(s + 1, e + 1) :+ V(s)
        
        V.take(s) ++ I ++ V.slice(e + 1, V.length)
    }
    
}
