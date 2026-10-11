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
        int length = lengthyy(head);
        int pos = length - n;

       
        if (pos == 0) {
            return head.next;
        }

        ListNode curr = head;
        for (int i = 1; i < pos; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;
        return head;
    }

    public int lengthyy(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }
}
