class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int prod = 1;
        int n = nums.length;
        prod = (nums[n - 1] * nums[n - 2] * nums[n - 3]);
        int prod1 = (nums[0] * nums[1] * nums[n - 1]);

        return Math.max(prod, prod1);
    }
}