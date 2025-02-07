class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> res=new ArrayList<>();
        Inorder(res,root);
        return res;
    }
    private static void Inorder(ArrayList<Integer> res,Node root){
        if(root==null) return;
        Inorder(res,root.left);
        res.add(root.data);
        Inorder(res,root.right);
    }
}
