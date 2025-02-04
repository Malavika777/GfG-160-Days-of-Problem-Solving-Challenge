class Solution {
    int diameter(Node root) {
        // Your code here
        int[] res=new int[1];
        find(root,res);
        return res[0];
    }
    private static int find(Node node ,int[] res){
        if(node==null) return 0;
        int left=find(node.left,res);
        int right=find(node.right,res);
        res[0]=Math.max(res[0],left+right);
        return 1+Math.max(left,right);
    }
}
