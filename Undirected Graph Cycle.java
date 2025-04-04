class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V,int[][] edge) {
        // Code here
        List<Integer>[] adj=new ArrayList[V];
        for(int i=0;i<V;i++)
            adj[i]=new ArrayList<>();
        for(int[] e:edge){
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }
        int vis[]=new int[adj.length];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(checkCycle(i,-1,adj,vis)==true) return true;
            }
        }
        return false;
    }
    private boolean checkCycle(int node,int parent,List<Integer>[] adj,int vis[]){
        vis[node]=1;
        for(int i:adj[node]){
            if(vis[i]==0){
                if(checkCycle(i,node,adj,vis)==true) return true;
            }
            else if(i!=parent) return true;
        }
        return false;
    }
}
