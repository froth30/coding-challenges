package com.codefights

import org.junit.Test

/**
  * Created by froth30 on 7/8/2017.
  */
class treeBottomTest {
    
    import treeBottom._
    
    var tree: String = _
    
    def testAgainst(output: Array[Int]): Unit = {
        assert(treeBottom(tree) sameElements output)
    }
    
    @Test
    def test1(): Unit = {
        tree = "(2 (7 (2 () ()) (6 (5 () ()) (11 () ()))) (5 () (9 (4 () ()) ())))"
        
        testAgainst(Array(5, 11, 4))
    }
    
    @Test
    def test2(): Unit = {
        tree = "(1 () ())"
        
        testAgainst(Array(1))
    }
    
    @Test
    def test3(): Unit = {
        tree = "(1 (2 (4 (8 () ()) (9 () ())) (5 (10 () ()) (11 () ()))) (3 (6 (12 () ()) (13 () ())) (7 (14 () ()) (15 () ()))))"
        
        testAgainst(Array(8, 9, 10, 11, 12, 13, 14, 15))
    }
    
    @Test
    def test4(): Unit = {
        tree = "(1 () (2 () (3 () (5 () (8 () (13 () (21 () (34 () ()))))))))"
        
        testAgainst(Array(34))
    }
    
}
