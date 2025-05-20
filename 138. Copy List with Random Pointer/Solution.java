/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       if(head==null)
        return null;
        Node dummyHead=new Node(-1);
        Node dummy=dummyHead;
        Node temp=head;
        while(temp !=null){
            Node newNode=new Node(temp.val);
            newNode.next=temp.next;
            temp.next=newNode;
            temp=newNode.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.random!=null){
                temp.next.random=temp.random.next;
            }
            temp=temp.next.next;
        }
        temp=head;
        while(temp!=null){
            dummy.next=temp.next;
            dummy=dummy.next;
            temp.next=dummy.next;
            temp=temp.next;
        }
        return dummyHead.next;
        
    }
}
