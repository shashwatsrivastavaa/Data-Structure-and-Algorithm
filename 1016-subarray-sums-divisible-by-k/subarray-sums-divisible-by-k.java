import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int prefsum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            prefsum = prefsum + nums[i];
            int need = prefsum % k;
            if (need < 0) {
                need += k;
            }
          
            if (map.containsKey(need)) {
                count += map.get(need);
            }
            map.put(need, map.getOrDefault(need, 0) + 1);

        }
        return count;

    }
}