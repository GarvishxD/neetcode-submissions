class Solution {
    public int maxArea(int[] heights) {
        int i = 0 , j = heights.length-1;
        int max = Integer.MIN_VALUE;
        while(i< j){
          
            int area1 = Math.min(heights[i] , heights[j]) * Math.abs(i-j);
            max = Math.max(max , area1);
            if(heights[i] < heights[j]){
                i++;
            }
            else{
                j--;
            }
           
        }
        return max;
    }
}
