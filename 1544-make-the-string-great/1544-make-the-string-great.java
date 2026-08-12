class Solution {
    public String makeGood(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if (!st.isEmpty() && Math.abs(ch - st.peek()) == 32) {
                st.pop(); 
            } else {
                st.push(ch); 
            }
        }
        StringBuilder sb = new StringBuilder();
        int size=st.size();
        for(int i=0;i<size;i++){
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}