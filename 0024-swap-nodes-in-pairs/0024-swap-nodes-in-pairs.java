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
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null)
            return head;

        ListNode temp = head;
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;

        while (temp != null && temp.next != null) {

            ListNode front = temp.next;
            ListNode nextPair = front.next;

            t.next = front;
            front.next = temp;
            temp.next = null;

            t = temp;
            temp = nextPair;
        }
        if (temp != null) {
            t.next = temp;
        }

        return dummy.next;
    }
}