class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i< nums.length ; i++){
            int l = i+1 , r = nums.length-1;
            while(l <= r){
                int diff = target - nums[i];
            int mid = (l + r)/2;
            if(nums[mid] == diff){
                return new int [] {i+1 , mid+1};
            }
            else if(nums[mid] > diff){
                r = mid -1; 
            }
            else{
                l = mid+1;
            }
        }
        }
        return null;
    }
}
