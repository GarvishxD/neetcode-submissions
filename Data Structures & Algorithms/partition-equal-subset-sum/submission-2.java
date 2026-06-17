class Solution {
    boolean solve(int i , int []nums , int sum , int [][]dp){
        int n = nums.length;
        if(sum == 0) return true;
        if(i>=nums.length || sum < 0) return false;
        if(dp[i][sum] != -1) return dp[i][sum] == 1;
        boolean pick = solve(i+1 , nums , sum - nums[i],dp);
        boolean skip= solve(i+1 , nums, sum,dp);
        
        boolean ans =  pick || skip;
        if(ans == true) dp[i][sum] = 1;
        else dp[i][sum] = 0;
        return ans;
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0 ; i<nums.length ; i++){
            sum+=nums[i];
        }
        if(sum %2 != 0) return false;
        int target = sum/2;
        int [][]dp = new int [n][target+1];
        for(int i = 0 ; i<dp.length ; i++){
            for(int j = 0 ; j<dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        return solve(0,nums,target,dp);
    }
}
