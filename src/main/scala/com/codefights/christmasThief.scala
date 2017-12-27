package com.codefights

/** CodeFights Challenge `christmasThief`
  *
  * @author froth30
  * @since  Dec 26, 2017
  */
object christmasThief {

  /** Given a list containing each participating member along with whom they sent a gift to, finds
    * the list of thieves sorted by name lexicographically so HR can easily look them up.
    *
    * @param c  A list of people who are participating in the gift exchange and to whom they've
    *           sent their gift. These names contain only alphabetic characters.
    *           <ul>''Guaranteed constraints:''
    *           <br> &#9 `3 ≤ coworkers.length ≤ 10`^`4`^
    *           <br> &#9 `coworkers[i].length == 2`
    *           <br> &#9 `3 ≤ coworkers[i][j].length ≤ 10`^`3`^
    * @return   A list of people who aren't giving gifts to coworkers sorted lexicographically.
    *           These are the thieves!
    */
  def christmasThief(c: Array[Array[String]]): Array[String] = {
    c.filter(p =>
      ! c.exists(q => q(0) != p(0) & q(0) == p(1)) |
        c.exists(q => q(0) != p(0) & q(1) == p(1))
    ).map(_(0)) sorted
  }

}
