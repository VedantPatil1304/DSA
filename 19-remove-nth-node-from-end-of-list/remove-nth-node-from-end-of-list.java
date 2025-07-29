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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        ListNode slow=head;

        //edge case if n=length of ll then fast reaches null
        if(fast==null){
            return head.next;
        }
        //now move them simultaneously till fast reaches last element 
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        //when loop breaks that means fast reaches last element slow is at the node whose next we wanna delete

        slow.next=slow.next.next;

        return head;

    }
}