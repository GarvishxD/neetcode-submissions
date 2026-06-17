class Solution {
    int solve(int i , int []coins , int amount , int [][]dp){
        if(amount == 0 ) return 0;
        if(amount < 0) return Integer.MAX_VALUE;
        if(i>=coins.length) return Integer.MAX_VALUE;
        int pick = Integer.MAX_VALUE , skip = 0;
        if(dp[i][amount] != -1) return dp[i][amount];
    if(coins[i] <= amount){
    int temp = solve(i , coins , amount - coins[i],dp);
    if(temp != Integer.MAX_VALUE){
        pick = 1 + temp;
    }
    }
        skip = solve(i+1 , coins , amount,dp);
    return dp[i][amount] =  Math.min(pick , skip);
    }
    public int coinChange(int[] coins, int amount) {
        int [][] dp = new int[coins.length][amount+1];
        for(int i = 0 ; i<dp.length ; i++){
            for(int j= 0 ; j< dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        int ans =  solve(0,coins,amount,dp);
        if(ans == Integer.MAX_VALUE) return -1;
        return ans;
    }
}
