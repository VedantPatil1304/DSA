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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode middle=findMiddle(head);
        ListNode leftHead=head;
        ListNode rightHead=middle.next;

        middle.next=null;

        leftHead=sortList(leftHead);
        rightHead=sortList(rightHead);

        return mergeTwoSortedLinkedLists(leftHead,rightHead);
    }


    public ListNode findMiddle(ListNode head){
    if (head == null || head.next == null) {
        return head;
    }
    // Initializing slow and fast pointers
    ListNode slow = head;
    ListNode fast = head.next;//do this to take m1 in even case
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
    }

    public ListNode mergeTwoSortedLinkedLists(ListNode list1, ListNode list2) {
    // Create a dummy node to serve
    // as the head of the merged list
    ListNode dummyNode = new ListNode(-1);
    ListNode temp = dummyNode;

    // Traverse both lists simultaneously
    while (list1 != null && list2 != null) {
        // Compare elements of both lists and
        // link the smaller node to the merged list
        if (list1.val <= list2.val) {
            temp.next = list1;
            list1 = list1.next;
        } else {
            temp.next = list2;
            list2 = list2.next;
        }
        // Move the temporary pointer
        // to the next node
        temp = temp.next; 
    }

    // If any list still has remaining
    // elements, append them to the merged list
    if (list1 != null) {
        temp.next = list1;
    } else {
        temp.next = list2;
    }
    // Return the merged list starting 
    // from the next of the dummy node
    return dummyNode.next;
}
}