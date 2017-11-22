package com.codefights

/** CodeFights Challenge `isDivisibleBy3`
  * 
  * @author froth30
  * @since  Nov 21, 2017
  */
object isDivisibleBy3 {
    
    def isDivisibleBy3(s: String): Array[String] = {
        var a = Array[String]()
        ('0' to '9').foreach(c => {
            val r = s replace('*', c)
            if (r.sum % 3 < 1) a :+= r
        })
        
        a
    }
    
}
