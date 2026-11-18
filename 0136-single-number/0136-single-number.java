class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            int c = map.getOrDefault(nums[i],0);
            map.put(nums[i],c+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() == 1){
                ans=entry.getKey();
            }
        }
        return ans;
    }
}