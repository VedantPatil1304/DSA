/**
 * Definition for singly-linked list.
 * public class ListListListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {

        if(head==null || head.next==null) return null;
        ListNode slow=head;
        ListNode fast=head;

        fast=fast.next.next;//as we want thee element 1 before the middle we so this to skip 1 step of slow 
                            //so slow stops 1 step before middle element

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //we are at the element justbefore middle
        slow.next=slow.next.next;

        return head;
    }
}