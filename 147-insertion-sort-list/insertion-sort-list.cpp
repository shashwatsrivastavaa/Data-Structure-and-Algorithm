/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* insertionSortList(ListNode* head) {
        ListNode* sort=NULL;

        while(head){
            ListNode*current=head;
            head=head->next;
            current->next=NULL;

            if(!sort || current->val < sort->val){
                current->next=sort;
                sort=current;
            }
            else{
                ListNode*temp= sort;
                while(temp->next && temp->next->val < current->val){
                    temp=temp->next;
                }
            
            current->next=temp->next;
            temp->next=current;
        }
        }
        return sort;
        }
       

    };