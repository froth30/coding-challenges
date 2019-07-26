package com.codesignal

/**
  * Created by froth30 on 7/8/2017.
  */
object treeBottom {
    
    def treeBottom(tree: String): Array[Int] = {
        // Simplify tree expression
        val treeArray = tree.replace("()", "").replace(" ", "").toCharArray
    
        // Map characters in expression to their respective depths in tree
        var depth = 0
        val depthMap = treeArray.zipWithIndex.map(_.swap)
                .zip(treeArray.map {
                    case '(' => depth += 1; depth - 1
                    case ')' => depth -= 1; depth
                    case _ => depth
                }).toMap
    
        // Filter deepest characters into new map
        val maxDepth = depthMap.values.max
        var leafMap = depthMap.filter(_._2 == maxDepth).keys
                .map(p => (p._1, p._2.toInt - '0')).toMap
    
        // Parse node values from characters, merging multi-digit numerals
        leafMap.toStream.sorted.reverse.foreach(p => {
            val prev = leafMap.find(q  => q._1 == p._1 - 1)
            if (prev.isDefined) {
                leafMap += prev.get._1 -> (prev.get._2 * 10 + p._2)
                leafMap -= p._1
            }
        })
    
        // Stream leaf nodes into array
        var leaves = Array.emptyIntArray
        leafMap.toStream.sorted.foreach(p => leaves :+= p._2)
    
        leaves
    }
    
}
