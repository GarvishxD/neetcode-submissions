class Solution {
    int solve(int i , int j , String text1 , String text2,int [][]dp){

        int m = text1.length();
        int n = text2.length();
        if(i >= m || j >= n) return 0;
       
        int skip1 = 0 , pick = 0 , skip2 = 0;
     if(dp[i][j] != -1) return dp[i][j];
                if(text1.charAt(i) == text2.charAt(j)){
                    pick = 1+ solve(i+1 , j+1 , text1 , text2,dp);
                }
               
                    skip1 = solve(i+1 , j , text1 , text2,dp);
                    skip2 = solve(i , j+1 , text1 , text2,dp);
                
            
        return dp[i][j] = Math.max(skip1 , Math.max(pick , skip2));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
         int [][]dp = new int[m+1][n+1];
         for(int i = 0 ; i<dp.length ; i++){
            for(int j = 0 ; j<dp[0].length ; j++){
                dp[i][j] = -1;
            }
         }
       return solve(0,0,text1 , text2,dp);
    } 
}
