import java.util.Map;
import java.util.HashMap;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        int prefsum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefsum += nums[i];

            int need = (prefsum % k);

            if (mp.containsKey(need) && i - mp.get(need) >= 2)
                return true;

            else if (!mp.containsKey(need)) {
                mp.put(need, i);
            }
        }
        return false;
    }
}