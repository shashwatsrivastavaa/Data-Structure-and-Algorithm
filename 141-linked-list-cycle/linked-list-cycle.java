/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> freq = new HashMap<>();     
        ListNode curr = head;
        while (curr != null) {
            freq.put(curr, freq.getOrDefault(curr, 0) + 1);
            
            if (freq.get(curr) > 1) {
                return true; 
            }
            curr = curr.next;
        }
        return false; 
    }
}
