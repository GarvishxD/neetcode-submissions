class Solution {
    int solve(int i , int []nums , int[]dp){
        if(i >= nums.length-1) return 0;
        if(dp[i] != -1) return dp[i];
        int max = Integer.MIN_VALUE;
        for(int j = i+1 ; j<nums.length ; j++){
            if(j<= i + nums[i]){
                int ans =solve(j , nums,dp);
                if(ans != Integer.MIN_VALUE){
                    max = Math.max(max , 1 + ans);
                }
            }
        }
        return dp[i] = max;
    }
    public boolean canJump(int[] nums) {
        int []dp = new int[nums.length];
        Arrays.fill(dp , -1);
        int ans = solve(0,nums,dp);
        if(ans <0){
            return false;
        }
        return true;
    }
}