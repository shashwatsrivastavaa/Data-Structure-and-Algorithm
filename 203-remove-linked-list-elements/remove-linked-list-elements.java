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
    public static ListNode deletenode(ListNode head, int val) {

    // Base condition..
    if (head == null) 
    return null;

    // check the first step of the linked list....
    if (head.val == val) {
        return deletenode(head.next, val);  
    }

    // Ange ki linked list me traversal karke check karo aur mile to hta doo
    head.next = deletenode(head.next, val);
    return head;
}

    public ListNode removeElements(ListNode head, int val) {
        return deletenode(head,val);
    }
}