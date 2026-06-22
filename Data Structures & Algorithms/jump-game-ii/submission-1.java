class Solution {
    int solve(int i , int []nums , int []dp){
        if(i>=nums.length-1) return 0;
        int min = Integer.MAX_VALUE;
        if(dp[i] !=-1) return dp[i];
        for(int j = i+1 ; j<nums.length ; j++){
            if(j<= i + nums[i]){
                int ans = solve(j,nums,dp);
            if(ans != Integer.MAX_VALUE){
                min = Math.min(min , 1 + ans);
            }

            }
        }
        return  dp[i] = min;
    }
    public int jump(int[] nums) {
        int []dp = new int [nums.length];
        for(int i = 0 ; i<nums.length ; i++){
            dp[i] = -1;
        }
        int ans = solve(0,nums,dp);
        if(ans < 0) return -1;
        return ans;
    }
}
