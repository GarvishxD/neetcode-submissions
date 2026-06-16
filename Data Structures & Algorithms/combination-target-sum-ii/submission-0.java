class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        solve(0 , ans ,new ArrayList<>() , candidates , target);
        return ans;
    }
    void solve(int idx ,List<List<Integer>> ans , List<Integer> curr ,int []candidates , int target){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(target < 0) return ;
        
        for(int i = idx ; i<candidates.length ; i++){
            if(i> idx && candidates[i] == candidates[i-1]) continue;
        curr.add(candidates[i]);
        solve(i+1 , ans , curr , candidates , target - candidates[i]);
        curr.remove(curr.size()-1);
        }
    }
}
