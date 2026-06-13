class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> mp = new HashMap<>();
        for(int i = 0 ; i< nums.length ; i++){
            mp.put(nums[i] , mp.getOrDefault(nums[i] , 0) + 1);
        }
        List<Integer> ans = new ArrayList<>(mp.keySet());
        Collections.sort(ans , (a , b) -> mp.get(b) - mp.get(a));
        int []result = new int [k];
        for(int i = 0 ; i<k ; i++){
            result[i] = ans.get(i); 
        }
        return result;
    }
}
