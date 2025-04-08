class Solution {
    public boolean isBridge(int V, int[][] edges, int c, int d) {
        // code here
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        for(int[] e:edges){
            int u=e[0],v=e[1];
            if(u==c&&v==d||u==d&&v==c) continue;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] vis=new boolean[V];
        dfs(c,adj,vis);
        return !vis[d];
    }
    public static void dfs(int c,List<List<Integer>>adj,boolean[] vis){
        vis[c]=true;
        for(int node:adj.get(c)){
            if(!vis[node])
                dfs(node,adj,vis);
        }
    }
}
