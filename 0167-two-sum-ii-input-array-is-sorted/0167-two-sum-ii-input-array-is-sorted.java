class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int j=n-1;
        int i=0;
        
        while(i<j){
            if(nums[i]+nums[j]==target){
                return new int[] {i+1,j+1}; 
            }else if(nums[i]+nums[j] > target){
                j--;
            }else{
                i++;
            }
        }
        return new int[] {};
    }
}