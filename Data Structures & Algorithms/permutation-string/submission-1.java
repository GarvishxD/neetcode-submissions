class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character , Integer> mp1 = new HashMap<>();
        Map<Character , Integer> mp2 = new HashMap<>();
        if(s1.length() > s2.length()) return false;
        for(int i = 0 ; i<s1.length() ; i++){
            mp1.put(s1.charAt(i) , mp1.getOrDefault(s1.charAt(i) , 0) + 1 );
            mp2.put(s2.charAt(i) , mp2.getOrDefault(s2.charAt(i) , 0) + 1 );
        }
        if(mp1.equals(mp2)) return true;
        for(int i = s1.length() ; i< s2.length() ; i++){
            mp2.put(s2.charAt(i) , mp2.getOrDefault(s2.charAt(i) , 0) + 1 );
            char remove = s2.charAt(i - s1.length());
            mp2.put(remove , mp2.get(remove)-1);
            if(mp2.get(remove) == 0){
                mp2.remove(remove);
            }
            if(mp1.equals(mp2)){
                return true;
            }
        }
        return false;
    }
}
