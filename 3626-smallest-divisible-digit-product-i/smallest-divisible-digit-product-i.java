class Solution {
    public int smallestNumber(int n, int t) {

        for (int i = n; i <= 100; i++) {
            int prod = 1;
            int digit = i;

            while (digit != 0) {
                int temp = digit % 10;
                prod *= temp;
                digit = digit / 10;
            }

            if (prod % t == 0) {
                return i;
            }

        }
        return 0;

    }
}