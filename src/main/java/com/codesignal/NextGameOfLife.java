package com.codesignal;

/**
 * CodeFights Challenge `nextGameOfLife`
 *
 * @since Jul 19, 2017
 * @see <a href="https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life">Conway's Game of Life</a>
 * @author froth30
 */
public class NextGameOfLife {
    
    public static int[][] nextGameOfLife(int[][] seed) {
        int[][] next = seed.clone();
        int row, col, nrows = seed.length, ncols = seed[0].length,
                liveNeighbors, I[] = {-1, 0, 1};
        
        for (row = 0; row < nrows; row++) {
            for (col = 0; col < ncols; col++) {
                liveNeighbors = 0;
                for (int i : I) {
                    for (int j : I) {
                        if (!(i == 0 && j == 0)) {
                            liveNeighbors += seed[row + i][col + j];
                        }
                    }
                }
                
                if (seed[row][col] == 1) {
                    if (liveNeighbors < 2 || liveNeighbors > 3)
                        next[row][col] = 0;
                } else if (liveNeighbors == 3) {
                    next[row][col] = 1;
                }
            }
        }
        
        return next;
    }
    
}
