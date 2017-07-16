package com.codefights

/**
  * Created by froth30 on 7/16/2017.
  */
object IsSpecialPalindrome {
    
    def isSpecialPalindrome(n: Int) = {
        val s = n.toBinaryString
        
        s == s.reverse &&
        s.count(_ == '0') == 1 &&
        s.contains('1')
    }
    
}
