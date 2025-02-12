class Solution {
    // Return the Kth smallest element in the given BST
    public int kthSmallest(Node root, int k) {
        // Write your code here
        int[] c={0};
        return find(root,k,c);
    }
    private static int find(Node root,int k,int[] c){
        if(root==null) return -1;
        int left=find(root.left,k,c);
        if(left!=-1) return left;
        c[0]++;
        if(c[0]==k) return root.data;
        int right=find(root.right,k,c);
        return right;
    }
}
