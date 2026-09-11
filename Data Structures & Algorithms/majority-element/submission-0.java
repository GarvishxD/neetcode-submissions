class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer , Integer> mp = new HashMap<>();
        for(int i = 0 ; i< nums.length ; i++){
            mp.put(nums[i] , mp.getOrDefault(nums[i] , 0) + 1);
        }
        for(int key : mp.keySet()){
        if(mp.get(key) > nums.length/2){
            return key;
        }
        }
        return -1;
    }
}