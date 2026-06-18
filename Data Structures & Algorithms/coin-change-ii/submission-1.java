class Solution {
    int solve(int i , int amount , int []coins , int [][] dp){
        if(i >= coins.length) return 0;
        if(amount == 0) return 1;
        if(dp[i][amount] != -1) return dp[i][amount];
        int pick = 0 , skip = 0;
        if(coins[i] <= amount){
            pick =  solve(i , amount - coins[i] , coins,dp);
        }
        
        skip = solve(i+1 , amount , coins,dp);
      
        return dp[i][amount] = pick + skip;
    }
    public int change(int amount, int[] coins) {
        int [][]dp = new int[coins.length][amount+1];
        for(int i = 0 ; i<dp.length ; i++){
            for(int j = 0 ; j<dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        return solve(0,amount , coins , dp);
    }
}
