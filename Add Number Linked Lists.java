class Solution {
    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static Node trim(Node head){
        while(head!=null&&head.data==0){
            head=head.next;
        }
        return head;
    }
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        Node res=null;
        Node curr=null;
        int carry=0;
        Node n1=trim(num1);
        Node n2=trim(num2);
        n1=reverse(n1);
        n2=reverse(n2);
        while(n1!=null||n2!=null||carry!=0){
            int s=carry;
            if(n1!=null){
                s+=n1.data;
                n1=n1.next;
            }
            if(n2!=null){
                s+=n2.data;
                n2=n2.next;
            }
            Node nn=new Node(s%10);
            carry=s/10;
            if(res==null){
                res=nn;
                curr=nn;
            }else{
                curr.next=nn;
                curr=curr.next;
            }
        }
        return reverse(res);
    }
}
