package com.codesignal;

/**
 * CodeFights Challenge `buildSum`
 *
 * @since Aug 6, 2017
 * @author froth30
 */
public class BuildSum_Java {
    
    public static double buildSum(int n) {
        return n > 0
                ? Math.pow(n,n) + buildSum(--n)
                : 1;
    }
    
}
