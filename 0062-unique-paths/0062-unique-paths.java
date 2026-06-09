class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];

        return count(dp , m-1, n-1);
    }
    private int count(int dp[][] , int row , int col){

        if(row == 0 || col == 0) return 1;

        if(dp[row][col] != 0){
            return dp[row][col];
        }
        dp[row][col] = count(dp , row-1 , col) + count(dp , row , col-1);
        return dp[row][col];
    }
}