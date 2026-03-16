/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
#include <iostream>
#include <cmath>
using namespace std;

// Definition for a binary tree node.
class Solution {
public:
    int moves = 0;

    int traversal(TreeNode* node) {
        if (node == 0)
        return 0;
        int left = traversal(node->left);
        int right = traversal(node->right);
        moves += abs(left) + abs(right);
        return node->val + left + right - 1;
    }

    int distributeCoins(TreeNode* root) {
        traversal(root);
        return moves;
    }
};
