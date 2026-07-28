class Solution {
    public int characterReplacement(String s, int k) {
        int[] map = new int[26];
        int left = 0;
        int maxfreq = 0;
        int maxlength = 0;
        int length = -1;

        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);
            map[curr - 'A']++;

            maxfreq = Math.max(maxfreq, map[curr - 'A']);

            length = right - left + 1;

            while (length - maxfreq > k) {
                map[s.charAt(left) - 'A']--;
                left++;
                length = right - left + 1;
            }
            maxlength = Math.max(maxlength, length);
        }
        return maxlength;
    }
}