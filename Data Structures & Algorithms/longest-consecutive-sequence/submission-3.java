class Solution {
    int solve(int idx , int prev , int []nums,int [][]dp){
        
        if(idx>=nums.length) return 0;
        if(dp[idx][prev+1] != -1) return dp[idx][prev+1];
        int pick = 0 , skip = 0;
        if(prev == -1 || Math.abs(nums[idx] - nums[prev]) == 1){
            pick = 1 + solve(idx+1,idx , nums,dp);
        }
        skip = solve(idx+1 , prev , nums,dp);
        return dp[idx][prev+1] = Math.max(pick , skip);
    }
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int [][]dp = new int [n][n+1];
        for(int i = 0 ; i<dp.length ; i++){
            for(int j = 0 ; j<dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        Arrays.sort(nums);
        return solve(0,-1,nums,dp);
    }
}
