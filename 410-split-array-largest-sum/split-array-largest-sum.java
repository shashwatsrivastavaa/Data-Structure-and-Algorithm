class Solution {

    static boolean isValid(int[] nums, int k, int mid) {
        int count = 1;
        int pages = 0;

        for (int i = 0; i < nums.length; i++) {
            if (pages + nums[i] <= mid) {
                pages = pages + nums[i];
            } else {
                count++;
                if (count > k) {
                    return false;
                } else if (nums[i] > mid) {
                    return false;
                } else {
                    pages = 0;
                    pages = pages + nums[i];
                }
                
            }
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {

        int n = nums.length;

        int st = 0;

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int end = sum;
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (isValid(nums, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }
}