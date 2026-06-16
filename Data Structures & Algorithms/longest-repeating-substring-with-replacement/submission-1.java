class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character , Integer> mp = new HashMap<>();
        int i = 0 , j = 0 , max = Integer.MIN_VALUE , maxfreq = 0;
        while(j<s.length()){
            mp.put(s.charAt(j) , mp.getOrDefault(s.charAt(j) , 0) + 1 );
            maxfreq = Math.max(maxfreq , mp.get(s.charAt(j)));
            while(j-i+1 - maxfreq > k){
                mp.put(s.charAt(i) , mp.get(s.charAt(i)) - 1);
                i++;
            }
            max = Math.max(max , j-i+1);
            j++;

        }
        return max;
    }
}
