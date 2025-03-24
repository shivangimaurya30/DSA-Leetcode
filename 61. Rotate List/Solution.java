/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
         if(head==null || head.next==null) return head;
        ListNode curr=head;
        int size=0;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        int rotate=k%size;
        for(int i=0;i<rotate;i++){
            ListNode last=head;
            ListNode prev=null;
            while(last.next!=null){
                prev=last; 
                last=last.next; 
            }
            last.next=head;
            prev.next=null;
            head=last;
        }
        return head;  
    }
}
