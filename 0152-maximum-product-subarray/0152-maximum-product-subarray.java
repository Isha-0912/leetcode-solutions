class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max_prod = nums[0];
        int min_prod=nums[0];
        int ans=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i] < 0){
                int temp=max_prod;
                max_prod=min_prod;
                min_prod=temp;
            }
            max_prod=Math.max(nums[i],max_prod*nums[i]);
            min_prod=Math.min(nums[i],min_prod*nums[i]);
            ans=Math.max(max_prod,ans);
        }
        return ans;
    }
}