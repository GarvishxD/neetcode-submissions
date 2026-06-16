class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int []ans = new int[nums.length-k+1];
        int i = 0 , j = 0 , idx = 0;
        while(j<nums.length){
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                int max = nums[i];
                for(int x = i ; x <= j ; x++){
                    max = Math.max(max , nums[x]);
                }
                ans[idx++] = max;
                i++;
                j++;
            }
        }
        return ans;
    }
}
