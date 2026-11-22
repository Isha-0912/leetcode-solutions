class Solution {
    public long minCost(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        long ans = Long.MAX_VALUE;
        int i=0;
        while(i<n){
            int j = i;
            while(j+1 <n && nums[j+1] == nums[i]){
                j++;
            }
            if(i<=n-2 && j>=1){
                long cost = (long) (i+n-1-j)*nums[i];
                ans = Math.min(ans,cost);
            }
            i=j+1;
        }
        return ans;
    }
}