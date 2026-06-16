class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l= 0 , max = Integer.MIN_VALUE;
        for(int r = 0 ; r<s.length() ; r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                    l++;
            }

            set.add(s.charAt(r));
            max = Math.max(max , r-l+1);
        }
        if(max < 0) return 0;
        return max;
    }
}
