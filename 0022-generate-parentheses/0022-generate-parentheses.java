class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        getAllParenthesis(n,0,0,"",ans);
        return ans;
    }
    public void getAllParenthesis(int n, int opening,int clossing,String s,List<String> ans){
        if(opening<clossing){
            return;
        }
        if(opening == n && clossing == n){
            ans.add(s);
            return;
        }

        if(opening == n && clossing!=n){
            getAllParenthesis(n,opening,clossing+1,s+')',ans);
        }
        else{
            getAllParenthesis(n,opening+1,clossing,s+'(',ans);
            getAllParenthesis(n,opening,clossing+1,s+')',ans);
        }

    }

}