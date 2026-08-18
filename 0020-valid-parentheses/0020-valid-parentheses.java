import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 1. Push opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } 
            // 2. Validate closing brackets
            else {
                if (st.isEmpty()) return false;
                
                if (ch == ')' && st.peek() == '(') st.pop();
                else if (ch == ']' && st.peek() == '[') st.pop();
                else if (ch == '}' && st.peek() == '{') st.pop();
                else return false; // Mismatched bracket pair
            }
        }

        return st.isEmpty();
    }
}