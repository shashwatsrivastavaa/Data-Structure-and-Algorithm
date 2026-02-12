
class Solution {
public:
    TreeNode* pruneTree(TreeNode* root) {
        return dfs(root) ? root:NULL;
    }
    bool dfs(TreeNode*node){
        if(node==NULL)      // base condition
        return false;

        bool leftst = dfs(node->left);
        bool rightst = dfs(node->right);

        if(leftst == false )
            node->left=NULL;
        

        if(rightst == false)
            node->right=NULL;

            if(node->val==1 || leftst==true || rightst==true)
                return true;


                return false;
    }  

    
};