class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int start = 0;
        int totalTank = 0;
        int currTank = 0;
        for(int i=0;i<n;i++){
            int net = gas[i]-cost[i];
            totalTank+=net;
            currTank+=net;
            if(currTank < 0){
                start = i+1;
                currTank=0;
            }
        }
        return totalTank>=0? start:-1;
    }
}