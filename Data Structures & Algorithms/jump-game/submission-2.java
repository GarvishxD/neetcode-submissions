class Solution {
    int solve(int i , int []nums , int []dp){
        if(i >= nums.length-1) return 0;
        int max = Integer.MIN_VALUE;
        if(dp[i] != -1) return dp[i];
        for(int j = i+1 ; j< nums.length ; j++){
            if(j <= nums[i] + i){
            int ans = solve(j,nums,dp);
            if(ans != Integer.MIN_VALUE){
                max = Math.max(max , 1 + ans);
            }
            }
        }
        return dp[i] = max;
    }
    public boolean canJump(int[] nums) {
        int []dp = new int[nums.length+1];
        for(int i = 0 ; i < dp.length ; i++){
           
                dp[i] = -1;
            
        }
       int ans =  solve(0,nums, dp);
       if(ans < 0) return false;
       else{
       return true;
    }
    }
}