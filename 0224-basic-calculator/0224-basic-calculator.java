class Solution {
    public int calculate(String s) {
        int n = s.length();
        int res=0;
        int sign=1;
        int num=0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num=(num*10)+(ch-'0');
            }else if(ch=='+'){
                res+=num*sign;
                num=0;sign=1;
            }else if(ch=='-'){
                res+=num*sign;
                num=0;sign=-1;
            }else if(ch=='('){
                st.push(res);
                st.push(sign);
                num=0;sign=1;res=0;
            }else if(ch==')'){
                res+=num*sign;
                num=0;
                res*=st.pop();
                res+=st.pop();
            }else{
                continue;
            }
        }
        res+=sign*num;
        return res;
    }
}