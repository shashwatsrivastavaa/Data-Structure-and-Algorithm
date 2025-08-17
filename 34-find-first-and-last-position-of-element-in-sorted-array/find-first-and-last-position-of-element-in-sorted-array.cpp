class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int first = -1, last = -1;
        int n = nums.size();

        if (n == 0) 
        return {-1, -1};
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                if (first == -1) 
                first = i;
                last = i;
            }
        }

        return {first, last};
    }
};
