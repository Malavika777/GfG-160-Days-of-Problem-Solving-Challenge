class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int n=adj.size();
        ArrayList<Integer>vis=new ArrayList<>(Collections.nCopies(n,0));
        ArrayList<Integer>res=new ArrayList<>();
        dfs(0,adj,vis,res);
        return res;
    }
    public void dfs(int start,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> vis,ArrayList<Integer> res){
        vis.set(start,1);
        res.add(start);
        for(int node:adj.get(start)){
            if(vis.get(node)==0)
                dfs(node,adj,vis,res);
        }
    }
}
