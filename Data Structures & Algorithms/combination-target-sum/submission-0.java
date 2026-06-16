class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
         solve(0,new ArrayList<>() ,ans , nums,target );
        return ans;
    }
    void solve(int idx , List<Integer> curr , List<List<Integer>> ans , int []nums , int target){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(target< 0) return;
        else{
        for(int i = idx ; i< nums.length ; i++){
            curr.add(nums[i]);
            solve(i , curr , ans , nums , target - nums[i]);
            curr.remove(curr.size()-1);
        }
    }
    }
}
