class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n=s.length();
        int i=0;int j=0;
        int max_win=0;
        while(j<n){
            if(map.containsKey(s.charAt(j))){
                i=Math.max(i,map.get(s.charAt(j))+1);
            }
            map.put(s.charAt(j),j);
            max_win=Math.max((j-i)+1,max_win);
            j++;
        }
        return max_win;
    }
}