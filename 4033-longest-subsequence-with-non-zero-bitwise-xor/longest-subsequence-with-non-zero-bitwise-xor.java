class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        int cnt = 0;
        int n = nums.length;
        for (int x : nums) {
            xor ^= x;
            if (x == 0) 
            cnt++;
        }
        if (xor != 0) return n;
        return cnt == n ? 0 : n - 1;
    }
}
