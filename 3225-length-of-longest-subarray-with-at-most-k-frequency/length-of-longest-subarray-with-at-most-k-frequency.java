import java.util.*;

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int left = 0;
        int right = 0;
        int currlen = 0;
        int maxlen = 0;

        for (right = 0; right < nums.length; right++) {
            mp.put(nums[right], mp.getOrDefault(nums[right], 0) + 1);

            while (mp.get(nums[right]) > k) {
                mp.put(nums[left], mp.get(nums[left]) - 1);
                left++;
            }
            currlen = right - left + 1;
            maxlen = Math.max(maxlen, currlen);
        }

        return maxlen;
    }
}