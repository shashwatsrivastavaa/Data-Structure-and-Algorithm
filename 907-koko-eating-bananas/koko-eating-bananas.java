class Solution {
    public boolean isValid(int[] piles, int h, int maxbanana) {

        int hours = 0;

        for (int pile : piles) {
            hours += (pile + maxbanana - 1) / maxbanana;

            if (hours > h) {
                return false;
            }
        }
        return true;

    }

    public int minEatingSpeed(int[] piles, int h) {
        int k = piles.length;

        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int ans = -1;

        while (left <= right) {
            int maxbanana = left + (right - left) / 2;

            if (isValid(piles, h, maxbanana)) {
                ans = maxbanana;
                right = maxbanana - 1;
            } else {
                left = maxbanana + 1;
            }
        }
        return ans;
    }
}