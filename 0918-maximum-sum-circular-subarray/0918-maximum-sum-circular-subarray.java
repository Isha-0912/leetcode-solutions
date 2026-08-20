class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int curr_max=0;
        int curr_min=0;
        int max_sum=nums[0];
        int min_sum=nums[0];
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
            curr_max=Math.max(curr_max+nums[i],nums[i]);
            curr_min=Math.min(curr_min+nums[i],nums[i]);
            max_sum=Math.max(curr_max,max_sum);
            min_sum=Math.min(curr_min,min_sum);
        }
        return max_sum<0?max_sum:Math.max(max_sum,total-min_sum);
    }
}