class Solution {
    void reverse(int i , int j , int []nums){
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int K = k%n;
        reverse(0 , n-1 , nums);
        reverse(0 , K-1 , nums);
        reverse(K  , n-1 , nums);
    }
}