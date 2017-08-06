package com.codefights

/**
  * CodeFights Challenge `calculateNetworkAddress`
  *
  * @since Aug 5, 2017
  * @author froth30
  */
object CalculateNetworkAddress {
    
    /**
      * Calculates the network address of an IP address in CIDR notation.
      *
      * @param cidr The string in the format "n1.n2.n3.n4/m", where all n-s are 0 ≤ n ≤ 255 and 0 ≤ m ≤ 32.
      * @return The network address of the given CIDR notation.
      */
    def calculateNetworkAddress(cidr: String): String = {
        val components = cidr.split('/')
        val blocks = components(0).split('.')
        val bits = blocks.map(_.toInt.toBinaryString.toInt.formatted("%08d")).mkString
        val mask = components(1).toInt
        var networkAddress = bits.toArray
        
        (1 to mask).foreach(i => networkAddress(i-1) = bits(i-1))
        (mask to 31).foreach(networkAddress(_) = '0')
        
        (0 to 3).foreach(i => {
            blocks(i) = Integer.parseInt(networkAddress.take(8).mkString, 2).toString
            networkAddress = networkAddress.drop(8)
        })
        
        blocks.mkString(".")
    }
    
}
