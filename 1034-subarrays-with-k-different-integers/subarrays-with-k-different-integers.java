import java.util.*;

class Solution {
    public static int atmost(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int left = 0;
        int right = 0;
        int count = 0;

        while (right < nums.length) {
            mp.put(nums[right], mp.getOrDefault(nums[right], 0) + 1);
            while (mp.size() > k) {
                mp.put(nums[left], mp.get(nums[left]) - 1);
                if (mp.get(nums[left]) == 0) {
                    mp.remove(nums[left]);
                }
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return (atmost(nums, k) - atmost(nums, k - 1));
    }
}