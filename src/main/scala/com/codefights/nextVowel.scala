package com.codefights

/** CodeFights Challenge `nextVowel`
  * 
  * @author froth30
  * @since  Nov 26, 2017
  */
object nextVowel {
    
    /** Find the next vowel, given a single character.
      *
      * @param v  An English vowel
      *           <ul>''Guaranteed constraints:'' &#9 `v ∈ ['A', 'E', 'I', 'O', 'U']`
      * @return   The next English vowel, following alphabetical order.
      */
    def nextVowel(v: Int) = "E   I   O     U     A" (v - 65)
    
}
