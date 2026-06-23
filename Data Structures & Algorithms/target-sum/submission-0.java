class Solution {
    int solve(int i , int []nums , int target){
        if(i >= nums.length){ 
        if(target == 0) return 1;
        return 0;
        }
        int plus = 0 , minus = 0;
        plus = solve(i+1,nums,target+nums[i]);
        minus = solve(i+1,nums,target - nums[i]);
        return minus+ plus;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return solve(0,nums,target);
    }
}
