class Solution {
    public int[] asteroidCollision(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()>0 && nums[i]<0 && st.peek()< -nums[i]){
                st.pop();
            }
            if(!st.isEmpty() && st.peek() >0 && nums[i]<0 && st.peek()== -nums[i]){
                st.pop();
                continue;
            }else if(!st.isEmpty() && st.peek() >0 && nums[i]<0 && st.peek() > -nums[i]){
                continue;
            }
            st.push(nums[i]);
        }
        int a = st.size();
        int[] res = new int[a];
        for(int i=a-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}