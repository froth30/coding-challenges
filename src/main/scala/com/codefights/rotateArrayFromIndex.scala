package com.codefights

/**
  * CodeFights Challenge `rotateArrayFromIndex`
  *
  * @since Jul 30, 2017
  * @author froth30
  */
object rotateArrayFromIndex {
    
    def rotateArrayFromIndex(v: Array[Int], s: Int, e: Int): Array[Int] =
        if (v.length < 2)
            v
        else if (e < s)
            rotateArrayFromIndex(v.reverse, e, s).reverse
        else
            v.slice(0, s) ++ (
                v.slice(s+1, e+1) :+ v(s)) ++
                v.slice(e+1, v.length)
    
}
