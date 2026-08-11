class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int total=0;
        for(int i=0;i<n;i++){
            int len1=expand(s,i,i);
            int len2=expand(s,i,i+1);
            total+=len1+len2;
        }
        return total;
    }
    public int expand(String s,int i,int j){
        int count=0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            count++;
            i--;
            j++;
        }
        return count;
    }
}