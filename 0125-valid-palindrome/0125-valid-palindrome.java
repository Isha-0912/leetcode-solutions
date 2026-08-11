class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n=str.length();
        StringBuilder sb = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        for(int i=0;i<n;i++){
            if(str.charAt(i)!=sb.charAt(i)) return false;
        }
        return true;
    }
}