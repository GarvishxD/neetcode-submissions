class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i<n ; i++){
            String ch = tokens[i];
            if(ch.equals("+")){
                st.push(st.pop() + st.pop());
            }
            else if(ch.equals("-")){
                int b = st.pop();
                int a = st.pop();
                st.push(a-b);
            }
            else if(ch.equals("*")){
                st.push(st.pop() * st.pop());
            }
            else if(ch.equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.push(b/a);
            }
            else{
                st.push(Integer.parseInt(ch));
            }
        }
        return st.pop();
    }
}
