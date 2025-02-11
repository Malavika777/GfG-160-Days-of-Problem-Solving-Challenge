class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        // code here.
        return find(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private static boolean find(Node root,int min,int max){
        if(root==null) return true;
        if(root.data<min||root.data>max) return false;
        return find(root.left,min,root.data-1)&&find(root.right,root.data+1,max);
    }
}
