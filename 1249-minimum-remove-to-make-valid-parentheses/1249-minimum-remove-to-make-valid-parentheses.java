class Solution {
    public String minRemoveToMakeValid(String s) {
        int n =s.length();
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(i);
            }else if(ch==')'){
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    sb.append('#');
                    continue;
                } 
                
            }
            sb.append(ch);
        }
        while(!st.isEmpty()){
            sb.setCharAt(st.pop(),'#');
        }
        StringBuilder ans = new StringBuilder();
        for(char ch:sb.toString().toCharArray()){
            if(ch!='#'){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}