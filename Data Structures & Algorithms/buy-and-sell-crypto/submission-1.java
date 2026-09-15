class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
       int l = 0 , r = 1 , max = Integer.MIN_VALUE;
       while(r <  prices.length){
    if(prices[r] > prices[l]){
        max = Math.max(max , prices[r] - prices[l]);
        
}
else{
    l = r;
}
r++;
       }
        if(max == Integer.MIN_VALUE){
            return 0;
        }
        return max;
    }
}
