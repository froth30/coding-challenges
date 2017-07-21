package com.codefights

/**
  * CodeFights Challenge `magicParade_1`
  *
  * @since Jul 20, 2017
  * @author froth30
  */
object MagicParade_1 {
    
    def magicParade_1(water: Int, fire: Int, death: Int): Boolean = {
        isSafeParade("", water, fire, death)
    }
    
    private def isSafeParade(parade: String, water: Int, fire: Int, death: Int): Boolean = {
        if (water < 0 || fire < 0 || death < 0)
            false

        else if (water == 0 && fire == 0 && death == 0)
            parade.nonEmpty

        else if (parade.nonEmpty && parade.last == 'D')
             isSafeParade(parade + "F", water, fire - 1, death)
            
        else if (parade.length() >= 3 && parade.endsWith("FFF"))
             isSafeParade(parade + "W", water - 1, fire, death)
            
        else isSafeParade(parade + "W", water - 1, fire, death) ||
             isSafeParade(parade + "F", water, fire - 1, death) ||
             isSafeParade(parade + "D", water, fire, death - 1)
    }
    
}
