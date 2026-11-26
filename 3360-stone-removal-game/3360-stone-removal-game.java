class Solution {
    public boolean canAliceWin(int n) {
        int take = 10;
        int turn = 0;
        while(n>=take){
            n=n-take;
            take-=1;
            turn+=1;
        }
        return turn % 2 ==1;
    }
}