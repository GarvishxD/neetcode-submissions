class Solution {
    int solve(int i , int []nums , int []dp){
        if(i>= nums.length-1) return 0;
        if(dp[i] != -1) return dp[i];
        int min= Integer.MAX_VALUE;
        for(int j = i + 1 ; j< nums.length ; j++){
            if(j <= nums[i] + i){
                int ans = solve(j,nums,dp);
                if(ans != Integer.MAX_VALUE){
                    min = Math.min(1 + ans , min);
                }
            }
        }
        return dp[i] =  min;
    }
    public int jump(int[] nums) {
        int[]dp = new int[nums.length];
        for(int i = 0 ; i < dp.length ; i++){
            dp[i] = -1;
        }
        return solve(0,nums,dp);
    }
}
