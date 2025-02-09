class Solution {
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null) return res;
        if(!isLeaf(root)) res.add(root.data);
        Left(root.left,res);
        Leaf(root,res);
        Right(root.right,res);
        return res;
    }
    private static boolean isLeaf(Node root){
        return root.left==null&&root.right==null;
    }
    private static void Left(Node root,ArrayList<Integer> res){
        if(root==null||isLeaf(root)) return ;
        res.add(root.data);
        if(root.left!=null)
            Left(root.left,res);
        else if(root.right!=null)
            Left(root.right,res);
    }
    private static void Leaf(Node root,ArrayList<Integer> res){
        if(root==null) return ;
        if(isLeaf(root)){
            res.add(root.data);
            return;
        }
        Leaf(root.left,res);
        Leaf(root.right,res);
    }
    private static void Right(Node root,ArrayList<Integer> res){
        if(root==null||isLeaf(root)) return;
        if(root.right!=null)
            Right(root.right,res);
        else if(root.left!=null)
            Right(root.left,res);
        res.add(root.data);
    }
}
