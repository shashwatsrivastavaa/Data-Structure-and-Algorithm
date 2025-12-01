/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        if (head == NULL || head->next == NULL) {
            return false;
        }

        ListNode *left = head;
        ListNode *right = head->next;

        while (left!= right) {
            if (right== NULL || right->next == NULL) {
                return false;
            }
            left= left->next;
            right = right->next->next;
        }

        return true;
    }
};
