class Solution {
    int solve(int i , int []nums , int target , int [][]dp){
        if(i >= nums.length){ 
        if(target == 0) return 1;
        return 0;
        }
        if(dp[i][target+2000] != -1) return dp[i][target + 2000];
        int plus = 0 , minus = 0;
        plus = solve(i+1,nums,target+nums[i],dp);
        minus = solve(i+1,nums,target - nums[i],dp);
        return dp[i][target + 2000] = minus+ plus;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int [][]dp = new int[nums.length+1][target+40001];
        for(int i = 0 ; i<dp.length ; i++){
            for(int j = 0 ; j<dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        return solve(0,nums,target,dp);
    }
}
