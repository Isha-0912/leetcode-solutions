class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n = s.length();
        int m = t.length();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='#'){
                if(!st1.isEmpty()){
                st1.pop();
                }
            }else{
                st1.push(s.charAt(i));
            }

        }
        for(int j=0;j<m;j++){
            if(t.charAt(j)=='#'){
                if(!st2.isEmpty()){
                    st2.pop();
                }
            }else{
                st2.push(t.charAt(j));
            }
        }
        if (st1.size() != st2.size()) return false;
        int size= st1.size();
        for(int i=0;i<size;i++){
            if(st1.peek() != st2.peek()) return false;
            st1.pop();
            st2.pop();
        }
        return true;
    }
}