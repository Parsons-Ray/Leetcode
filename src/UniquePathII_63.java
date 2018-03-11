/**
 * Now consider if some obstacles are added to the grids.
 * How many unique paths would there be?
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 */
public class UniquePathII_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(m == 0 || n == 0) return 0;
        if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1) return 0;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for(int i = 1; i < n; i++) {
            if(obstacleGrid[0][i] == 1)
                dp[0][i] = 0;
            else
                dp[0][i] = dp[0][i-1];
        }
        for(int j = 1; j < m; j++) {
            if(obstacleGrid[0][j] == 1)
                dp[j][0] = 0;
            else
                dp[j][0] = dp[j-1][0];
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++) {
                if(obstacleGrid[i][j] == 1)
                    dp[i][j] = 0;
                else
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
    }
}
