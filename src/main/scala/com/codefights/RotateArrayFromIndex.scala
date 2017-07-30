package com.codefights

/**
  * CodeFights Challenge `rotateArrayFromIndex`
  *
  * @since Jul 30, 2017
  * @author froth30
  */
object RotateArrayFromIndex {
    
    def rotateArrayFromIndex(values: Array[Int], start: Int, end: Int): Array[Int] = {
        var trueStart = math.min(start, values.length - 1)
        var trueEnd   = math.min(end,   values.length - 1)
        var interval  = values
        
        if (end < start) {
            val temp = trueStart
            trueStart = trueEnd
            trueEnd = temp
            interval = values(trueEnd) +: values.slice(trueStart, trueEnd)
        } else {
            interval = values.slice(trueStart + 1, trueEnd + 1) :+ values(trueStart)
        }
        
        values.take(trueStart) ++
            interval ++
            values.slice(trueEnd + 1, values.length)
    }
    
}
