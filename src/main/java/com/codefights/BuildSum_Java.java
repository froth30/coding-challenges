package com.codefights;

/**
 * CodeFights Challenge `buildSum`
 *
 * @since Aug 6, 2017
 * @author froth30
 */
public class BuildSum_Java {
    
    public static int buildSum(int n) {
        int s = 1;
        while (n > 0)
            s += Math.pow(n, n--);
        
        return s;
    }
    
}
