class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0 , max = Integer.MIN_VALUE;
        for(int j = 0 ; j< s.length() ; j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;

            }
            set.add(s.charAt(j));
            max = Math.max(j-i+1 , max);
        }
        if(max == Integer.MIN_VALUE) return 0;
        return max;
    }
}
