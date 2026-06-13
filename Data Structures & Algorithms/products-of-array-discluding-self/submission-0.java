class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int []suff = new int[n];
        int []pref = new int[n];
        suff[0] = 1;
        pref[n-1] = 1;
        int []ans = new int[n];
        for(int i = 1 ; i<n ; i++){
            suff[i] = nums[i-1]* suff[i-1]; 
        }
        for(int i = n-2 ; i>=0 ; i--){
            pref[i] = nums[i+1]*pref[i+1];
        }
        for(int i = 0 ; i<n ; i++){
            ans[i] = pref[i]* suff[i];
        }
        return ans;
    }
}  
