class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,new ArrayList<>() , ans , nums);
        return ans;        
    }
    void solve(int idx , List<Integer> curr , List<List<Integer>> ans , int [] nums){
        ans.add(new ArrayList<>(curr));
        for(int i = idx ; i<nums.length ; i++){
            curr.add(nums[i]);
            solve(i+1 , curr,ans,nums);
            curr.remove(curr.size()-1);
        }
    }
}
