class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int running_sum=0;
        int total_count=0;
        for(int i=0;i<n;i++){
            running_sum+=nums[i];
            int remainder=(((running_sum %k)+k)%k);
            if(map.containsKey(remainder)){
                total_count+=map.get(remainder);
            }
            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }
        return total_count;
    }
}