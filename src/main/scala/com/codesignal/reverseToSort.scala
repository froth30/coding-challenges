package com.codesignal

/** CodeSignal Challenge `reverseToSort`
  *
  * @author froth30
  * @since  Dec 29, 2019
  */
object reverseToSort {

  def reverseToSort(s: Seq[Int]) =
    0 to s.size-2 exists { i =>
      i+1 to s.size exists { j =>
        s.take(i) ++ s.slice(i,j).reverse ++ s.drop(j) == s.distinct.sorted
      }
    }

}
