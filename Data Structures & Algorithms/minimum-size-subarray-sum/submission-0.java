class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0 , j = 0 , min = Integer.MAX_VALUE , n = nums.length , sum = 0;
        while(j < n){
            sum+=nums[j];
            while(sum >= target){
            min = Math.min(j-i+1 , min);
            sum -=nums[i];
            i++;
            
        }
        j++;
        }
        if(min == Integer.MAX_VALUE){
            return 0;

        }
        return min;
    }
}