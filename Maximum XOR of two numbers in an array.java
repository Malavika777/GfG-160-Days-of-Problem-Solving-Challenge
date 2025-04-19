class Node{
    Node one,zero;
    Node(){
        one=null;
        zero=null;
    }
}
class Trie{
    Node root;
    Trie(){
        root=new Node();
    }
    void insert(int n){
        Node curr=root;
        for(int i=31;i>=0;i--){
            int bit=(n>>i)&1;
            if(bit==0){
                if(curr.zero==null)
                    curr.zero=new Node();
                curr=curr.zero;
            }
            else{
                if(curr.one==null)
                    curr.one=new Node();
                curr=curr.one;
            }
        }
    }
    int find(int n){
        Node curr=root;
        int res=0;
        for(int i=31;i>=0;i--){
            int bit=(n>>i)&1;
            if(bit==0){
                if(curr.one!=null){
                    curr=curr.one;
                    res+=(1<<i);
                }
                else curr=curr.zero;
            }
            else{
                if(curr.zero!=null){
                    curr=curr.zero;
                    res+=(1<<i);
                }
                else curr=curr.one;
            }
        }
        return res;
    }
}
class Solution {
    public int maxXor(int[] arr) {
        // code here
        int res=0;
        Trie t=new Trie();
        t.insert(arr[0]);
        for(int i=1;i<arr.length;i++){
            res=Math.max(res,t.find(arr[i]));
            t.insert(arr[i]);
        }
        return res;
    }
}
