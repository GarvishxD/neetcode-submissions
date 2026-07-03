class Solution {
    public String []alpha = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) return ans;
        solve(0,ans,"" , digits);
        return ans;
    }
    void solve(int i ,List<String> ans , String curr, String digits){
        if(i == digits.length()){
            ans.add(curr);
            return;
        }
        String word = alpha[digits.charAt(i) - '0'];
        for(int j = 0 ; j< word.length() ; j++){
            char ch = word.charAt(j);
            solve(i+1,ans,curr+ch , digits);
        }
    }
}
