class Solution {
   int solve(int i , int j , int m , int n , int [][]dp){
    if(i == m-1 && j == n-1) return 1;
        if(i<0 || j<0 || i>=m || j>=n){
            return 0 ;
        }
        if(dp[i][j] != -1) return dp[i][j];
        int down = 0 , right = 0;
        down = solve(i+1 , j , m , n,dp);
        right = solve(i , j+1 , m , n,dp);
        return dp[i][j] =  down + right;

    }
    public int uniquePaths(int m, int n) {
        int [][]dp = new int[m+1][n+1];
        for(int i = 0 ; i<dp.length ; i++){
            for(int j = 0 ; j<dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        return solve(0,0,m,n,dp);
    }
}
