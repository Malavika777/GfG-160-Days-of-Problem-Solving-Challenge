class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V,int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        for(int[] e:edges)
            adj.get(e[0]).add(e[1]);
        int[] ind=new int[V];
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++){
            for(int j:adj.get(i))
                ind[j]++;
        }
        for(int i=0;i<V;i++){
            if(ind[i]==0) q.add(i);
        }
        int c=0,i=0;
        while(!q.isEmpty()){
            int top=q.peek();
            q.remove();
            c++;
            for(int it:adj.get(top)){
                ind[it]--;
                if(ind[it]==0) q.add(it);
            }
        }
        return c==V?false:true;
    }
}
