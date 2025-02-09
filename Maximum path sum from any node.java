class Solution {
    // Function to return maximum path sum from any node in a tree.
    int findMaxSum(Node root) {
        // your code goes here
        int[] res={root.data};
        Find(root,res);
        return res[0];
    }
    private static int Find(Node root,int[] res){
        if(root==null) return 0;
        int l=Math.max(0,Find(root.left,res));
        int r=Math.max(0,Find(root.right,res));
        res[0]=Math.max(res[0],l+r+root.data);
        return root.data+Math.max(l,r);
    }
}
