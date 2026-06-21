
class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int prefsum[] = new int[n];

        prefsum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefsum[i] = prefsum[i-1] + nums[i];
        }

        return prefsum;
    }
}