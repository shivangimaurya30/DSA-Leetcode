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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prev=head;
        ListNode curr=head.next;
        ListNode head2=curr;
        int i=0;
        while(curr!=null &&curr.next!=null){
            i++;
            prev.next=curr.next;
            prev=curr;
            curr=curr.next;
        }
       if(i%2==1){
        curr.next=head2;
        prev.next=null;
       } else{
        prev.next=head2;
       }
        return head;
    }
}
