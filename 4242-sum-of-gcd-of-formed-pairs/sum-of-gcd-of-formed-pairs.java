import java.util.*;

class Solution {
    public int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public long gcdSum(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        int max = 0;

        
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]); 
            int g = gcd(nums[i], max);
            list.add(g);
        }

       
        Collections.sort(list);

       
        long sum = 0;
        for (int i = 0; i < n/2; i++) {
            sum += gcd(list.get(i),list.get(n-i-1));
        }


        return sum;
    }
}
