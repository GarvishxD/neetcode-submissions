class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            pq.add(num);
        }
        int []arr = new int[k];
        for(int i = 0 ; i< k ; i++){
            arr[i] = pq.poll();
        }
        return arr[k-1];
    }
}
