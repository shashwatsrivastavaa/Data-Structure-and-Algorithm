class Solution {
    public int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public int findGCD(int[] nums) {

        int a = Arrays.stream(nums).min().getAsInt();
        int b = Arrays.stream(nums).max().getAsInt();

        int ans = gcd(a, b);

        return ans;
    }
}