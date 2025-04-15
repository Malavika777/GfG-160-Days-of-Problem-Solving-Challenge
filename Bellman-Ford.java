class Solution {
    public int[] bellmanFord(int V, int[][] edges, int src) {
        // code here
        int[] dis=new int[V];
        Arrays.fill(dis,(int)1e8);
        dis[src]=0;
        for(int i=0;i<V;i++){
            for(int e[]:edges){
                int u=e[0],v=e[1],w=e[2];
                if(dis[u]!=(int)1e8&&dis[u]+w<dis[v]){
                    if(i==V-1) return new int[]{-1};
                    dis[v]=dis[u]+w;
                }
            }
        }
        return dis;
    }
}
