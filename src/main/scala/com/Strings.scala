package com

object Strings {
    
    lazy val continuationIndent = "                    "  // length of 20
    
    def fromArray(arr: Array[Any]): String =
        "[" + arr.map(_ + ", ").mkString.dropRight(2) + "]"
    
    def fromArrayOfArrays(arr: Array[Array[Any]]): String =
        "[" + arr.map(fromArray(_) + ",\n" + continuationIndent + " ")
            .mkString.dropRight(continuationIndent.length + 3) + "]"
    
    
    object ImplicitConversions {
        
        implicit def str2arr(str: String): Array[Int] = {
            if (str startsWith "[") str drop 1 dropRight 1 else str
        }.split(",").map(_.trim.toInt)
        
        implicit def toAnyArray(a: Array[Boolean ]): Array[Any] = a map(b => b)
        implicit def toAnyArray(a: Array[Short   ]): Array[Any] = a map(b => b)
        implicit def toAnyArray(a: Array[Int     ]): Array[Any] = a map(b => b)
        implicit def toAnyArray(a: Array[Long    ]): Array[Any] = a map(b => b)
        implicit def toAnyArray(a: Array[Char    ]): Array[Any] = a map(b => b)
        implicit def toAnyArray(a: Array[Float   ]): Array[Any] = a map(b => b)
        implicit def toAnyArray(a: Array[Double  ]): Array[Any] = a map(b => b)
    }
    
}
