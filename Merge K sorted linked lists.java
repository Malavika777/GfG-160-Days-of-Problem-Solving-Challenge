class Solution {
    // Function to merge K sorted linked list.
    Node mergeKLists(List<Node> arr) {
        // Add your code here.
        if(arr.size()==0) return null;
        return find(0,arr.size()-1,arr);
    }
    public static Node find(int i,int j,List<Node> arr){
        if(i==j) return arr.get(i);
        int mid=i+(j-i)/2;
        Node h1=find(i,mid,arr);
        Node h2=find(mid+1,j,arr);
        Node head=merge(h1,h2);
        return head;
    }
    public static Node merge(Node h1,Node h2){
        Node dummy=new Node(-1);
        Node curr=dummy;
        while(h1!=null&&h2!=null){
            if(h1.data<=h2.data){
                curr.next=h1;
                h1=h1.next;
            }
            else{
                curr.next=h2;
                h2=h2.next;
            }
            curr=curr.next;
        }
        if(h1!=null) curr.next=h1;
        else curr.next=h2;
        return dummy.next;
    }
}
