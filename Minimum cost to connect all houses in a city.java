class Solution {
    public int minCost(int[][] houses) {
        // code here
        int n=houses.length,res=0;
        PriorityQueue<int[]>pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));;
        boolean[] vis=new boolean[n];
        pq.add(new int[]{0,0});
        while(!pq.isEmpty()){
            int[] min=pq.poll();
            int cost=min[0];
            int u=min[1];
            if(vis[u]) continue;
            vis[u]=true;
            res+=cost;
            for(int v=0;v<n;v++){
                if(!vis[v]){
                    int dis=Math.abs(houses[u][0]-houses[v][0])+Math.abs(houses[u][1]-houses[v][1]);
                    pq.add(new int[]{dis,v});
                }
            }
        }
        return res;
    }
}
