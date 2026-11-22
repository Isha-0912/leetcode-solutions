class Solution {
    public long minCost(int[] nums) {
        int n=nums.length;
        long ans= (long)nums[0]+nums[n-1];
        long sumNeg = 0;
        long countNeg = 0;
        int maxNeg = Integer.MIN_VALUE;
        int minNonNeg = Integer.MAX_VALUE;
        for(int i=1;i<n-1;i++){
            if(nums[i]<0){
                sumNeg +=nums[i];
                countNeg++;
                maxNeg = Math.max(maxNeg,nums[i]);
            }else{
                minNonNeg = Math.min(minNonNeg,nums[i]);
            }
        }
        ans+=sumNeg;
        if(countNeg % 2 !=0){
            long removeNegative = -(long) maxNeg;
            long addPositive = (minNonNeg == Integer.MAX_VALUE)?Long.MAX_VALUE:minNonNeg;
            ans+=Math.min(removeNegative,addPositive);
        }
        return ans;
    }
}