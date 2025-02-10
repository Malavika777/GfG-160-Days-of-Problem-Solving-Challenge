class Solution {
    public int sumK(Node root, int k) {
        // code here
        HashMap<Integer,Integer>m=new HashMap<>();
        return find(root,k,0,m);
    }
    private static int find(Node root,int k,int curr,HashMap<Integer,Integer>m){
        if(root==null) return 0;
        int path=0;
        curr+=root.data;
        if(curr==k) path++;
        path+=m.getOrDefault(curr-k,0);
        m.put(curr,m.getOrDefault(curr,0)+1);
        path+=find(root.left,k,curr,m);
        path+=find(root.right,k,curr,m);
        m.put(curr,m.get(curr)-1);
        return path;
    }
}
