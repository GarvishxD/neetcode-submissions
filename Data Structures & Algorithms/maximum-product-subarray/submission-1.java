class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int product = 1;
        int max = Integer.MIN_VALUE;
        int left = 1;
        int right = 1;
        for(int i = 0 ; i<n ; i++){
        left *= nums[i];
        right *= nums[n-i-1];
        max= Math.max(max , Math.max(left , right));
        if(left == 0) left = 1;
        if(right == 0) right = 1;
        }
        return max;
    }
}
