class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer , Integer> mp = new HashMap<>();
        for(int i = 0 ; i< nums.length ; i++){
            mp.put(nums[i] , mp.getOrDefault(nums[i] , 0) + 1 );
        }
        for(int key : mp.keySet()){
            if(mp.get(key) > nums.length/3){
                ans.add(key);
            }
        }
        return ans;
    }
}