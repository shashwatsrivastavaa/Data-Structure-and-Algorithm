import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int subsum = 0;
        List<Integer> temp = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        for (int num : mp.keySet()) {
            if (mp.get(num) > 1) {
                temp.add(num);
            }
        }

        Set<Integer> st = new HashSet<>();
        for (int m : nums) {
            st.add(m);
        }
        for (int i : st) {
            subsum += i;
        }
        int k = n * (n + 1) / 2 - subsum;
        temp.add(k);

        return temp.stream().mapToInt(i -> i).toArray();
    }
}