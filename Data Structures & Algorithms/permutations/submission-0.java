class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[]vis= new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,new ArrayList<>() , ans,nums,vis);
        return ans;
    }
    void solve(int idx ,List<Integer> curr , List<List<Integer>> ans , int[] nums ,boolean []vis){
        if(curr.size() == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0 ; i<nums.length ; i++){
            if(vis[i]){
                continue;
            }
            curr.add(nums[i]);
            vis[i] = true;
            solve(i+1 , curr , ans , nums , vis);
            curr.remove(curr.size()-1);
            vis[i] = false;
        }
    }
}
