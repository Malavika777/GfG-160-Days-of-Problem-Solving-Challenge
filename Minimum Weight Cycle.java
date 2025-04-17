class Solution {
    public int findMinCycle(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int e[]:edges){
            int u=e[0],v=e[1],w=e[2];
            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }
        int min=Integer.MAX_VALUE;
        for(int e[]:edges){
            int u=e[0],v=e[1],w=e[2];
            int dist=shortest(V,adj,u,v);
            if(dist!=Integer.MAX_VALUE)
                min=Math.min(min,dist+w);
        }
        return min;
    }
    public static int shortest(int V,ArrayList<ArrayList<int[]>>adj,int src,int des){
        int[] dis=new int[V];
        Arrays.fill(dis,Integer.MAX_VALUE);
        PriorityQueue<int[]>pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        dis[src]=0;
        pq.add(new int[]{0,src});
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int d=curr[0],u=curr[1];
            if(d>dis[u]) continue;
            for(int[] neigh:adj.get(u)){
                int v=neigh[0],w=neigh[1];
                if((u==src&&v==des)||(u==des&&v==src)) continue;
                if(dis[v]>dis[u]+w){
                    dis[v]=dis[u]+w;
                    pq.add(new int[]{dis[v],v});
                }
            }
        }
        return dis[des];
    }
};
