package com.codefights

object Strings {
    
    def fromArray(arr: Array[Any]): String = {
        val str =
            if (arr isEmpty)  ""
            else  arr.map(_ + ", ").mkString.dropRight(2)
    
        "[" + str + "]"
    }
    
    @deprecated("Needs work, especially for neat indentation", "Oct 15, 2017")
    def fromArrayOfArrays(arr: Array[Array[Any]]): String = {
        val str =
            if (arr isEmpty)  ""
            else  arr.map(fromArray(_) + ",\n").mkString.dropRight(2)
        
        "[" + str + "]"
    }
    
}
