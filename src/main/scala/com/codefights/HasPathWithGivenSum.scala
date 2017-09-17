package com.codefights

/**
  * CodeFights Interview Practice `hasPathWithGivenSum`
  *
  * @since Sep 16, 2017
  * @author froth30
  */
object HasPathWithGivenSum {
    
    /** Preallocated integer variable for preventing recursive creation of local value. */
    var x = 0
    
    /**
      * Determines whether there is a root-to-leaf path in `t` such that the sum of vertex values equals `s`.
      *
      * @param t  A binary tree of integers.
      * @param s  The integer sum needed to be achieved along any path.
      * @return   `true` if there is a path from root to leaf in `t` such that the sum of node values in it
      *           is equal to `s`, otherwise return `false`.
      */
    def hasPathWithGivenSum(t: Option[Tree[Int]], s: Int): Boolean = {
        if (t.isEmpty) return s == 0
    
        hasPathWithGivenSum(t.get, s)
    }
    
    /** Recursive helper method for `hasPathWithGivenSum(Option[Tree[Int]``], Int)`. */
    def hasPathWithGivenSum(t: Tree[Int], s: Int): Boolean = {
        x = s - t.value
    
        if (t.left .isDefined && hasPathWithGivenSum(t.left .get, x)) return true
        if (t.right.isDefined && hasPathWithGivenSum(t.right.get, x)) return true
        
        t.left.isEmpty && t.right.isEmpty && x == 0
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
