package com.codefights

/**
  * Created by froth30 on 7/16/2017.
  */
object IsSpecialPalindrome {
    
    def isSpecialPalindrome(n: Int): Boolean = {
        val s = n.toBinaryString
        
        s.count(_ == '0') == 1 && s.contains('1') && {
            for (i <- 0 to s.length / 2)
                if (s.charAt(i) != s.charAt(s.length-1-i))
                    return false
            true
        }
    }
    
}
