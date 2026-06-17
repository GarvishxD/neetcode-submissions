class Solution {
    int solve(int idx , int prev , int []nums){
        
        if(idx>=nums.length) return 0;
        int pick = 0 , skip = 0;
        if(prev == -1 || Math.abs(nums[idx] - nums[prev]) == 1){
            pick = 1 + solve(idx+1,idx , nums);
        }
        skip = solve(idx+1 , prev , nums);
        return Math.max(pick , skip);
    }
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        return solve(0,-1,nums);
    }
}
