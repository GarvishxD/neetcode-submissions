class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gsum = 0 , csum = 0;
        for(int i = 0 ; i< gas.length ; i++){
            gsum+=gas[i];
            csum+=cost[i];
        }
        if(gsum < csum ) return -1;
        int idx = 0 , currgas = 0;
        for(int i = 0 ; i< gas.length ; i++){
            currgas += gas[i] - cost[i];
            if(currgas < 0){
                idx = i+1;
                currgas = 0;
            }
        }
        return idx;
    }
}
