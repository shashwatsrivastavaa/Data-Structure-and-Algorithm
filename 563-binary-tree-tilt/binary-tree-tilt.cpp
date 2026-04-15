/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left),
 * right(right) {}
 * };
 */
class Solution {
public:
    int findTilt(TreeNode* root) {
        binarytree(root);
        return tt;
    };

    int tt = 0;
    int binarytree(TreeNode* root) {
        if (root == NULL)
            return 0;

        int left = binarytree(root->left);

        int right = binarytree(root->right);

        int tilt = abs(left - right);

        tt = tt + tilt;

        return (left + right + root->val);
    }
};