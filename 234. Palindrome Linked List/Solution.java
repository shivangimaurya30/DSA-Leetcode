class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head; //rev first half
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null &&fast.next!=null){
            fast=fast.next.next;
            ListNode nextNode=slow.next;
            slow.next=prev;
            prev=slow;
            slow=nextNode;

        }
        if(fast!=null){
            slow=slow.next;
        }
        while(slow!=null){ //odd ll
            if(prev.val!=slow.val){
                return false;
            }
            prev=prev.next;
            slow=slow.next;
        }
        return true;
    }
}
