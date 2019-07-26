package com.codesignal

/** CodeFights Challenge `hollowDiamond`
  *
  * @author froth30
  * @since  Dec 31, 2017
  */
object hollowDiamond {

  /** Given an integer `n`, constructs a ''hollow diamond'' where:
    * <ul>
    *   <li>The constituents of the diamond are asterisks (`*`);
    *   <li>The diagonal of the diamond equals `2n + 1`;
    *   <li>The largest possible square of asterisks is removed from the center of the diamond;
    *   <li>The string representation of the diamond contains spaces in place of newlines.
    * </ul>
    *
    * @example  <li>For `n = 3`, the output should be:
    *             <pre>    `hollowDiamond(n) = "      *     * * *   *       * * *       * *   *       *     * * *       *"`.
    *             </pre>
    *           </li>
    *           <li>For `n = 4`, the output should be:
    *             <pre>    `hollowDiamond(n) = "        *       * * *     * * * * *   * *       * * * * *       * * *   * *       * *     * * * * *       * * *         *"`.
    *             </pre>
    *           </li>
    * @param n  An integer representing the side length of the diamond
    *           <ul>''Guaranteed constraints:'' &#9 `0 < n ≤ 160`
    * @return   A string representation of the ''hollow diamond'', constructed to specification.
    */
  def hollowDiamond(n: Int) = {
    var s = ""

    for (r <- 0 to 2*n) {
      val a = math abs n-r
      s += "  " * a
      for (c <- a to 2*n - a)
        s += {
          if (c > n/2 && c < 3*n/2f &
              r > n/2 && r < 3*n/2f )  "  " else "* "
        }
    }

    s dropRight 1
  }

}
