package com.codesignal

/**
  * CodeFights Challenge `calculateNetworkAddress`
  *
  * @since Aug 5, 2017
  * @author froth30
  */
object calculateNetworkAddress {
    
    /**
      * Calculates the network address of an IP address in CIDR notation.
      *
      * @param c The string in the format "n1.n2.n3.n4/m", where all n-s are 0 ≤ n ≤ 255 and 0 ≤ m ≤ 32.
      * @return The network address of the given CIDR notation.
      */
    def calculateNetworkAddress(c: String) = {
        val p = c split '/'
        val B = p(0) split '.'
        val b = B.map(_.toInt.toBinaryString.toInt.formatted("%08d")) mkString
        val m = p(1) toInt
        var n = b toArray
        
        1 to m foreach(i => n(i-1) = b(i-1))
        m to 31 foreach(n(_) = 48)
        
        0 to 3 foreach(i => {
            B(i) = Integer.parseInt(n take 8 mkString, 2).toString
            n = n drop 8
        })
        
        B mkString "."
    }
    
}
