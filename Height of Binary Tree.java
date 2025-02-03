class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        if(node==null) return 0;
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        int depth=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.lright);
            }
            depth++;
        }
        return depth-1;
    }
}
