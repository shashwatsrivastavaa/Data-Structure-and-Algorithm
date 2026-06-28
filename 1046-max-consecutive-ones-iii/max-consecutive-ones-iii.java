class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxlength = 0;
        int currlen = 0;
        int count = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                count++;
            }
            while (count > k) {
                if (nums[left] == 0) {
                    count--;
                }
                left++;
            }
            currlen = right - left + 1;
            maxlength = Math.max(maxlength, currlen);
            right++;

        }
        return maxlength;
    }

}