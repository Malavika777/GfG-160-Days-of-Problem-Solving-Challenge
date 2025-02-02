class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // Your code here
        if(root==null) return new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int lvl=0;
        q.add(root);
        while(!q.isEmpty()){
            int len=q.size();
            res.add(new ArrayList<>());
            for(int i=0;i<len;i++){
                Node node=q.poll();
                res.get(lvl).add(node.data);
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            lvl++;
        }
        return res;
    }
}
