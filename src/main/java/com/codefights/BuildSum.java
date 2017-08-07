package com.codefights;

/**
 * CodeFights Challenge `buildSum`
 *
 * @since Aug 6, 2017
 * @author froth30
 */
class BuildSum {
    
    public static int buildSum(int n) {
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s += Math.pow(i,i);
        }
        return s;
    }
    
}
