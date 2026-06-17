class Solution {
    int solve(int i , int []nums , int []dp){
        if(i >= nums.length) return 0;
        int n = nums.length;
        int pick = 0 , skip = 0;
        if(dp[i] != -1) return dp[i];
        pick = nums[i] + solve(i+2 , nums,dp);
        skip = solve(i+1 , nums,dp);
        return dp[i] = Math.max(pick , skip);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int []dp = new int [n];
        for(int i = 0 ; i<nums.length ; i++){
            dp[i] = -1;
        }
        return solve(0,nums , dp);
    }
}
