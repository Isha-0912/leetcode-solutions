class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st.push(0);
            }else{
                int top=st.pop();
                int val=st.pop();
                st.push(val+Math.max(1,top*2));
            }
        }
        return st.peek();
    }
}