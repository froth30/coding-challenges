package com.codesignal

/** CodeFights Challenge `concatenationProcess`
  * 
  * @author froth30
  * @since  Oct 08, 2017
  */
object concatenationProcess {
    
    type A = Array[String]
    
    /** Description
      *
      * @param a  Definition
      * @return   Something
      */
    def concatenationProcess(a: A) = {
        var z = Array("")
        while (a.count(_ != "") > 1) {
            z :+= p(a)
            z :+= p(a)
        }
        a ++: z mkString
    }
    
    def p(a: A) = {
        val s = a filter(_ != "") minBy(_ length)
        a(a indexOf s) = ""
        
        s
    }
    
}
