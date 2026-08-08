class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temp[st.peek()]<=temp[i]){
                st.pop();
            }
            if(!st.isEmpty()) res[i]=st.peek()-i;
            st.push(i);
        }
        return res;
    }
}