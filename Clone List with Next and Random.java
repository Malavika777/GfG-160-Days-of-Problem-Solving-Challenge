class Solution {
    public Node cloneLinkedList(Node head) {
        // code here
        if(head==null) return null;
        Node curr=head;
        while(curr!=null){
            Node nn=new Node(curr.data);
            nn.next=curr.next;
            curr.next=nn;
            curr=nn.next;
        }
        curr=head;
        while(curr!=null){
            if(curr.random!=null)
                curr.next.random=curr.random.next;
            curr=curr.next.next;
        }
        curr=head;
        Node chead=head.next;
        Node clone=chead;
        while(clone.next!=null){
            curr.next=curr.next.next;
            clone.next=clone.next.next;
            curr=curr.next;
            clone=clone.next;
        }
        curr.next=null;
        clone.next=null;
        return chead;
        
        
    }
}
