public class Solution {
    int count(String s , int left , int right){
        int count = 0;
        while(left>= 0 && right< s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
            count++;
        }
        return count;
    }
    public int countSubstrings(String s) {
        int n = s.length();
        int total = 0;
        for(int i = 0 ; i<n ; i++){
            total+= count(s , i , i);
            total+= count(s , i , i+1);
        }
        return total;
    }
}