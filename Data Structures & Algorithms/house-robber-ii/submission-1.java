class Solution {
    int solve(int i , int []nums , int end , int []dp){
        if(i>end) return 0;
        int pick = 0 , skip = 0;
        if(dp[i] != -1) return dp[i];
        pick = nums[i] + solve(i+2 , nums , end,dp);
        skip = solve(i+1 , nums, end,dp);
        return dp[i] = Math.max(pick , skip);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int []dp1 = new int [n+1];
        if(n == 1) return nums[0];
        for(int i = 0 ; i<n ; i++){
            dp1[i] = -1;
        }
        int []dp2 = new int [n+1];
        for(int i = 0 ; i<n ; i++){
            dp2[i] = -1;
        }
        int case1 = solve(0,nums,n-2,dp1);
        int case2 = solve(1 , nums , n-1,dp2);
        return Math.max(case1 , case2);
        
    }
}
