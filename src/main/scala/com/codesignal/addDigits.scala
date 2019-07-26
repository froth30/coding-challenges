package com.codesignal

/** CodeFights Challenge `addDigits`
  * 
  * @author froth30
  * @since  Nov 03, 2017
  */
object addDigits {
    
    def addDigits(a: BigInt, b: Int, n: Int) = {
        var A = a
        
        1 to n foreach (_ => {
            var c = true
            9 to 0 by -1 foreach (d => if (c) {
                A = A * 10 + d
                if (A % b > 0)
                    A /= 10
                else
                    c = !c
            })
        })
        
        A + ""
    }
    
}
