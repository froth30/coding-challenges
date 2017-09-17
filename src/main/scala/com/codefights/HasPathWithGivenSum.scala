package com.codefights

/**
  * CodeFights Interview Practice `hasPathWithGivenSum`
  *
  * @since Sep 16, 2017
  * @author froth30
  */
object HasPathWithGivenSum {
    
    /**
      * Determines whether there is a root-to-leaf path in `t`such that the sum of vertex values equals `s`.
      *
      * @param t  A binary tree of integers.
      * @param s  The integer sum needed to be achieved along any path.
      * @return   `true` if there is a path from root to leaf in `t` such that the sum of node values in it
      *           is equal to `s`, otherwise return `false`.
      */
    def hasPathWithGivenSum(t: Option[Tree[Int]], s: Int): Boolean = {
        if (t.isEmpty) return false
    
        val x = s - t.get.value
        if (x == 0 || hasPathWithGivenSum(t.get.left, x)
                   || hasPathWithGivenSum(t.get.right, x)) true else false
    }
    
    /**
      * Definition for the binary tree class used in CodeFights Interview Practice `hasPathWithGivenSum`.
      *
      * @param  x  The value to be contained in the (root) node of this tree.
      * @tparam T  The type associated with this tree (e.g. `Int`).
      */
    class Tree[T](x: T) {
        
        var value : T = x
        
        var left  : Option[Tree[T]] = None
        var right : Option[Tree[T]] = None
        
    }
    
}
