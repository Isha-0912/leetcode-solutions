class Solution {
    public long[] earliestActivationTimes(int n, int[][] edges, int[] requiredSignals) {
        List<int[]>[] graph = new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i] = new ArrayList<>();
        }
        for(int[]e:edges){
            graph[e[0]].add(new int[]{e[1],e[2]});
        }
        long[] ans = new long[n];
        Arrays.fill(ans,-1);
        int[] count = new int[n];
        PriorityQueue<long[]> pq = new PriorityQueue<>((a,b)->Long.compare(a[0],b[0]));
        ans[0]=0;
        for(int[] edge:graph[0]){
            pq.offer(new long[]{edge[1],edge[0]});
        }
        while(!pq.isEmpty()){
            long[] curr =pq.poll();
            long time = curr[0];
            int node =(int) curr[1];
            if(ans[node] != -1){
                continue;
            }
            count[node]++;
            if(count[node]>=requiredSignals[node]){
                ans[node]=time;
                for(int[]edge:graph[node]){
                    int next = edge[0];
                    int delay = edge[1];
                    if(ans[next]==-1){
                        pq.offer(new long[]{time+delay,next});
                    }
                }
            }
        }
        return ans;
    }
}