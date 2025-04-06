class Solution {
    static ArrayList<Integer> topoSort(int V,int[][] edges) {
        // Your code here
        int vis[]=new int[V];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        for(int[] e:edges)
            adj.get(e[0]).add(e[1]);
        Stack<Integer>st=new Stack<Integer>();
        for(int i=0;i<V;i++){
            if(vis[i]==0)
                dfs(i,adj,vis,st);
        }
        ArrayList<Integer> res=new ArrayList<>();
        int i=0;
        while(!st.isEmpty()){
            res.add(st.pop());
        }
        return res;
    }
    private static void dfs(int node,ArrayList<ArrayList<Integer>> adj,int[] vis,Stack<Integer>st){
        vis[node]=1;
        for(int it:adj.get(node)){
            if(vis[it]==0)
                dfs(it,adj,vis,st);
        }
        st.push(node);
    }
}
