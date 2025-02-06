class Solution {
    public static Node buildTree(int inorder[], int preorder[]) {
        // code here
        int n=inorder.length;
        Map<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<n;i++)
            m.put(inorder[i],i);
        int[] pre={0};
        return build(m,preorder,pre,0,n-1);
    }
    private static Node build(Map<Integer,Integer> m,int preorder[],int[] pre,int left,int right){
        if(left>right) return null;
        int rVal=preorder[pre[0]];
        pre[0]++;
        Node root=new Node(rVal);
        int idx=m.get(rVal);
        root.left=build(m,preorder,pre,left,idx-1);
        root.right=build(m,preorder,pre,idx+1,right);
        return root;
    }
}
