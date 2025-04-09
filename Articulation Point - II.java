class Solution {
    static ArrayList<Integer> articulationPoints(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        for(int e[]:edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        int[] dis=new int[V],low=new int[V],vis=new int[V],AP=new int[V];
        int[] time={0};
        for(int i=0;i<V;i++){
            if(vis[i]==0)
                dfs(adj,i,vis,dis,low,time,-1,AP);
        }
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(AP[i]==1) res.add(i);
        }
        if(res.isEmpty()) res.add(-1);
        return  res;
    }
    public static void dfs(ArrayList<ArrayList<Integer>>adj,int u,int[] vis,int[] dis,int[] low,int[] time,int par,int[] AP){
        vis[u]=1;
        dis[u]=low[u]=++time[0];
        int ch=0;
        for(int v:adj.get(u)){
            if(vis[v]==0){
                ch++;
                dfs(adj,v,vis,dis,low,time,u,AP);
                low[u]=Math.min(low[u],low[v]);
                if(par!=-1&&low[v]>=dis[u]) AP[u]=1;
            }
            else if(v!=par) low[u]=Math.min(low[u],dis[v]);
        }
        if(par==-1&&ch>1) AP[u]=1;
    }
}
